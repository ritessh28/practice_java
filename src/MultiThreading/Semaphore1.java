package MultiThreading;

import java.util.concurrent.Semaphore;

public class Semaphore1 {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(3 ,true);
        for(int i=1;i<=10;i++)
        {
           new Thread(new Demo1(semaphore)).start();
        }

    }
}
class Demo1 implements Runnable
{
    Semaphore semaphore;
    public Demo1(Semaphore semaphore)
    {
        this.semaphore=semaphore;
    }
    @Override
    public void run()
    {
        try
        {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" has currently acquired");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" has finished working");
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            semaphore.release();
        }
    }
}
//semaphore restricts the no of thread which can enter the critical section at a time using permits as parameter which tell
// almost how many threads can enter at once so after the release of the thread only other thread can enter the order of
// execution is non-deterministic we can even support fair execution by using true
// methods
// acquire():if a thread want to acquire the critical section it can use acquire
// release():releases the acquired thread so other thread can enter
// useful in  situations where the thread which can acquire the block is limited
// rate limiter database connection api requests etc
