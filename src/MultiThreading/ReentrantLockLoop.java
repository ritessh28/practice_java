package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockLoop {
    public static void main(String[] args) {
        Resources2 resource=new Resources2();
        Thread t1=new Thread(()->
        {
            resource.function();


        },"T1");
        Thread t2=new Thread(resource::function,"T2");
        t1.start();
        t2.start();

    }
}
class Resources2
{
    Lock lock=new ReentrantLock(true);
    int attempts=0;
    boolean done=false;
    public void function() {


        while (!done && attempts < 5) {
            try {
                if (lock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " got the lock");
                        Thread.sleep(9000);
                        done = true;

                    } finally {
                        lock.unlock();
                    }
                } else {
                    attempts++;
                    System.out.println(Thread.currentThread().getName() + " attempts :" + attempts);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(done==false)
            System.out.println(Thread.currentThread().getName()+"gave up");


    }

}
//in  this example we are using loop to check every second if lock is free/available if yes it acquires it if already acquired
// then it run continuously for 5 seconds in the loop checking if its free if it does not get the lock in 5 seconds it gives up