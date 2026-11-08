package MultiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * PRODUCER-CONSUMER using Lock and Condition
 *
 * Idea: one shared "box" (Container) that holds only ONE item at a time.
 *   - Producer puts an item in. If the box is full, it must wait.
 *   - Consumer takes an item out. If the box is empty, it must wait.
 *
 * Threads:
 *   t1, t2 = producers (produce 1-5 and 6-10)
 *   b1, b2 = consumers (each consumes 5 items)
 *
 * Total: 10 items produced and 10 items consumed.
 */
public class producerConsumerUsingCondition {
    public static void main(String[] args) {

        // ONE shared Container: all four threads use this same object
        Container obj = new Container();

        // Producer 1: produces values 1 to 5, one per second
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);   // slow down so output is easy to read
                    obj.producer(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        // Producer 2: produces values 6 to 10, one per second
        Thread t2 = new Thread(() ->
        {
            for (int i = 6; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                    obj.producer(i);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        // Consumer 1: consumes 5 items (the loop variable is only a counter)
        Thread b1 = new Thread(() ->
        {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                    obj.consumer();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        // Consumer 2: consumes 5 items
        Thread b2 = new Thread(() ->
        {
            for (int i = 6; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                    obj.consumer();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        t1.start();
        b1.start();
        t2.start();
        b2.start();
    }
}

class Container {

    // The "box". Only accessed while holding the lock, so volatile is not needed.
    private Integer item;

    // The state of the box: true = full, false = empty.
    // The flag holds the REAL state; signals are only wake-up calls.
    private boolean flag = false;

    // One lock shared by producers and consumers.
    // Only one thread can be inside producer()/consumer() at a time.
    private final Lock lock = new ReentrantLock();

    // Two "waiting rooms" on the SAME lock:
    //   c1 = producers sleep here when the box is FULL
    //   c2 = consumers sleep here when the box is EMPTY
    private final Condition c1 = lock.newCondition();
    private final Condition c2 = lock.newCondition();

    public void producer(Integer value) throws InterruptedException {
        lock.lock();   // lock BEFORE try, so finally only unlocks if we really got it
        try {
            // Box is full -> producer must wait.
            // await() does two things: releases the lock AND sleeps in c1.
            // On wake-up it reacquires the lock first, then re-checks the while condition.
            // "while" (not "if") is needed because another thread may have changed
            // the state before we got the lock back.
            while (flag) {
                c1.await();
            }

            // Box is empty -> put the item in
            item = value;
            flag = true;

            // Print INSIDE the lock so no other thread can change item
            // or print its own message in between.
            System.out.println("produced value is " + item);

            // Box is no longer empty -> wake up a sleeping CONSUMER (waiting in c2).
            // If no consumer is sleeping, this does nothing, which is fine.
            c2.signal();
        } finally {
            lock.unlock();   // always release the lock, even if an exception happens
        }
    }

    public void consumer() throws InterruptedException {
        lock.lock();
        try {
            // Box is empty -> consumer must wait.
            // Releases the lock and sleeps in c2 until a producer signals c2.
            while (!flag) {
                c2.await();
            }

            // Box is full -> take the item out
            System.out.println("consumed value is " + item);
            item = null;
            flag = false;

            // Box is no longer full -> wake up a sleeping PRODUCER (waiting in c1).
            c1.signal();
        } finally {
            lock.unlock();
        }
    }
}

/*
 * SUMMARY OF THE RULE:
 *   Wait on your OWN condition, signal the OTHER side's condition.
 *
 *   Producer: await() on c1, signal() on c2
 *   Consumer: await() on c2, signal() on c1
 *
 * Nobody signals their own waiting room, otherwise the other side
 * would sleep forever (deadlock).
 */