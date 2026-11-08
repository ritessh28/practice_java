package MultiThreading;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class LikeCounterProblemWithoutLock {
    public static void main(String[] args) {
        LikeCounter obj=new LikeCounter();
        Thread t1=new Thread(obj::like);
        Thread t2=new Thread(obj::like);
        Thread t3=new Thread(obj::like);
        Thread t4=new Thread(obj::like);
        Thread t5=new Thread(obj::like);
        Thread t6=new Thread(obj::like);
        Thread t7=new Thread(obj::like);
        Thread t8=new Thread(obj::like);
        Thread t9=new Thread(obj::like);
        Thread t10=new Thread(obj::like);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        try
        {
            Thread.sleep(3000);
            System.out.println(obj.getValue());
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
class LikeCounter
{
    AtomicReference<Integer> totalCount=new AtomicReference<>(0);
    public void like()
    {
        Integer currentCount;
        Integer finalCount;
        //the while loop exits while all thread continue executing
        while(true)
        {
            //check the current value of totalCount everytime we will capture the latest value of totalCount
            currentCount=totalCount.get();

            //Increment like counter by 1 not in totalCount directly just in a variable so to assign later
            finalCount=currentCount+1;

            //check if the current count is what we saw earlier and if some other thread has changed the entire value
            //meaning it has incremented  the totalCount to some value or not so if it has changed then we need to read
            //the current value once again and perform increment to it
            if(totalCount.compareAndSet(currentCount,finalCount))
            {
                return;
            }

            System.out.println("conflict detected totalCount was changed reTrying again:");
        }
    }
    public int getValue()
    {
        return totalCount.get();
    }

}