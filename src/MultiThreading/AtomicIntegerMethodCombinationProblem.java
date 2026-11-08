package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerMethodCombinationProblem {
    public static void main(String[] args) throws InterruptedException {
        Fun obj=new Fun();
        Thread t1=new Thread(()->
        {
            obj.demo();
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {}
        });
        Thread t2=new Thread(()->
        {
            obj.demo();
        });
        t1.start();
        t2.start();
        Thread.sleep(2000);
        System.out.println(obj.item);
    }

}
class Fun
{
    AtomicInteger item=new AtomicInteger(5);
    public void demo()
    {
        //two threads can enter this section at once so even if we are decrementing it after some sleep
        //condition should be false but it has already entered inside if so it decrement it again
        // even if the condition is false
       if(item.get()>=5)
       {
           System.out.println(Thread.currentThread().getName());
           try {
               Thread.sleep(1000);
           }
           catch (InterruptedException e)
           {

           }
           item.decrementAndGet();
       }
    }
}
// so the issue in our program is we are using a combination of atomic method using one method ensures full atomicity
// but combining them may not be true