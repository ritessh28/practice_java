package MultiThreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class OwnThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(2,
                5,
                 10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(9));
        for(int i=1;i<=5;i++)
        {
            int id=i;
            executor.execute(()->
            {
                System.out.println("task "+id+" is performed by "+Thread.currentThread().getName());
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
            });
        }
        executor.shutdown();

    }
}
