package MultiThreading;

import java.util.concurrent.locks.*;

import static java.lang.Thread.sleep;

public class SynchronizedvsReentrant {
    public static Object monitor=new Object();
    public static Lock lock=new ReentrantLock();
    static void main(String[] args)  throws InterruptedException{
        Thread t1=new Thread(()->
        {
            lock.lock();
            try
            {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        });
        Thread t2=new Thread(()->
        {
            lock.lock();
            try
            {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        });
        t1.start();
        sleep(300);
        t2.start();
        sleep(400);
        System.out.println("ReentrantLock waiter: " + t2.getState());
        t1.join();
        t2.join();
        Thread b1=new Thread(()->
        {
           synchronized (monitor)
           {
               try {
                   sleep(3000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        Thread b2=new Thread(()->
        {
            synchronized (monitor)
            {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        b1.start();
        sleep(400);
        b2.start();
        sleep(100);
        System.out.println("synchronized blocker:"+b2.getState());



    }
}
