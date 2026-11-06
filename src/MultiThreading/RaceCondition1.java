package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceCondition1 {
    public static void main(String[] args) throws InterruptedException {
        Counter c1=new Counter();
        Thread t1 = new Thread(() ->{
            for(int i=1;i<=10000;i++)
              c1.increment();
        });
        Thread t2 = new Thread(() ->{
            for(int i=1;i<=10000;i++)
                c1.increment();
        });
        t1.start();
        t2.start();
        Thread.sleep(3000);
        System.out.println(c1.cnt);
        System.out.println(c1.ai);
    }
}
class Counter
{
    int cnt=0;
    AtomicInteger ai=new AtomicInteger(0);
    public synchronized void  increment()
    {
        cnt++;
        ai.incrementAndGet();
    }
}

//race condition is a situation where 2 threads use the same shared resource to increment or decrement the value because
//the value being non-atomic the result may not be as expected due to context switching between threads suppose there are
//two threads t1 and t2 and suppose both are incrementing a value if suppose t1 is trying to increment a value first it has
//read the value of that shared variable first which is initially 0 and suppose context switching happens and t2 gets
//cpu time to execute it and suppose it reads the value increment it and write/stores the value of shared resource by 1
//again context switching t1 start executing from where it left that is reading so reading already has happened and the
//value it read was 0 so even if it increments it will increment by 1 so again instead of 2 it becomes 1 because it has
//already read the value but before switching t2 has already incremented so we dont normally get the freshly updated value
// and the area/section which may cause race condition is called critical condition
//in our program it is increment method cause we are incrementing count there which may cause race condition
//and the shared resource is cnt variable
//to avoid this
//we can use either atomic integer or use synchronized keyword in Critical section which may cause race condition
