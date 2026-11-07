package MultiThreading;

import java.util.concurrent.locks.*;

public class ReentrantLock1 {
    public static void main(String[] args) {
        Material m1=new Material();
        Thread t1=new Thread(()->
        {
            System.out.println("running");
//            try
//            {
//                Thread.sleep(2000);
//            }
//            catch (InterruptedException e)
//            {
//                System.out.println(e.getMessage());
//            }
            m1.function();
        });
        Thread t2=new Thread(()->
        {
            System.out.println("running2");
            m1.function();
        });
        t1.start();
        t2.start();
    }
}
class Material
{
    Lock lock=new ReentrantLock();
    public  void function()
    {
        try {
            lock.lock();
            for (int i = 1; i <= 20; i++) {
                System.out.println(i + " ");
            }
        }
        finally {
          lock.unlock();
        }

    }

}
// we can acquire multiple locks from a single thread inside a single method but they all should be unlocked
// but only one thread can enter the critical section at  a time meaning if a lock is applied to a object while one thread
// is running another thread cannot enter the critical section
// A thread can hold multiple locks (or re-acquire the same one); every lock() needs a matching unlock().
// A given lock can be held by only one thread at a time, so while one thread holds it,
// other threads trying to acquire the SAME lock must wait (or give up with tryLock).