package MultiThreading;

import java.util.concurrent.Semaphore;

public class Semaphore2 {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(3);
        for(int i=1;i<=10;i++)
        {
            new Thread(new Worker(semaphore)).start();
        }

    }
}
class Worker implements Runnable
{
    Semaphore semaphore;
    public Worker(Semaphore semaphore)
    {
        this.semaphore=semaphore;
    }
    @Override
    public void run()
    {
        if(semaphore.tryAcquire())
        {
            try
            {
                System.out.println(Thread.currentThread().getName()+" has acquired currently");
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            finally {
                semaphore.release();
            }
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+" has lost hope and gave up");
        }


    }
}
//we even have methods like tryAcquireLock and tryAcquireLock(seconds,unit) so thread can do other work instead of waiting
// or give up