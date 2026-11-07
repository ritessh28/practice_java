package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public class ReentrantLock3 {
    public static void main(String[] args) {
        Resources1 resource=new Resources1();
        Thread t1=new Thread(()->
        {
            resource.function();


        },"T1");
        Thread t2=new Thread(resource::function,"T2");
        t1.start();
        t2.start();

    }
}
class Resources1
{
    Lock lock=new ReentrantLock(true);
    public void function()
    {
            try {
                if (lock.tryLock(4, TimeUnit.SECONDS)) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " got the lock");
                        Thread.sleep(3000);
                    } finally {
                        lock.unlock();
                    }
                }
                else
                    {
                        System.out.println("doing some other work "+Thread.currentThread().getName());
                    }

                }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

    }


}