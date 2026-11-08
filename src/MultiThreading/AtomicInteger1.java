package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger1 {
    public static void main(String[] args) {
        Countery c1 = new Countery();
        Thread t1 = new Thread(() ->
        {
            for (int i = 1; i <= 90000; i++)
            {
                c1.increment();
            }

        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 1; i <= 90000; i++)
            {
                c1.increment();
            }

        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {

        }
        System.out.println(c1.cnt);
    }

}
class Countery
{
//    volatile int cnt=0;
//    public void increment()
//    {
//        cnt=cnt+1;
//    }
      // the above cause problem
    AtomicInteger cnt=new AtomicInteger(0);
    public void increment()
    {
        cnt.incrementAndGet();
    }
}
//volatile does not solve race condition problem it is not visibility problem its just that two thread have already read the
//value first and then incrementing it which may cause race condition cause while modifying and writing they  will not get
// the real value cause they have already read value and  will perform operation on that operation only so to avoid this
// we use atomic Elements  which completes the entire task at once for ex reading modifying and writing at once or nothing at al
// atomic simply means completes the task entirely  or do nothing non-atomic is reverse of this meaning it can do context
// switching between the middle of task just 1 thread read the value and then switch so another thread this thread also
// reads the same value as thread 1 so even though any thread increment the value the incremented it is not visible to
// another thread
// atomicInteger has multiple methods we can use and do a task atomically
// even AtomicBoolean and Long are Present which are similar