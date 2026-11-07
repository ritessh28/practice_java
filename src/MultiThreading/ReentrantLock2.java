package MultiThreading;

import java.util.concurrent.locks.*;

public class ReentrantLock2 {
    public static void main(String[] args) {
        Resources resource=new Resources();
        Thread t1=new Thread(()->
        {
            resource.function();
        },"T1");
        Thread t2=new Thread(()->
        {
            resource.function();
        },"T2");
        t1.start();
        t2.start();
    }
}
class Resources
{
    Lock lock=new ReentrantLock();
    public void function()
    {
        if(lock.tryLock())
        {
            try
            {

                System.out.println(Thread.currentThread().getName()+" got the lock");
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            finally {
                lock.unlock();
            }
        }
        else
        {
            System.out.println("doing some other work "+Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
        }
    }

}
// tryLock() function just request to acquire a lock if it is free meaning if no other thread has acquired it. it gives
// lock to the thread and if some other thread has acquired it can do some other work we even have one overload
// method of it which takes  (time,TimeUnit) so what it does it instead of giving up it just wait for some seconds to release
// the lock acquired by another thread so if the current thread completes its execution and release the lock the thread which
// has waited for time can acquire the lock or give up