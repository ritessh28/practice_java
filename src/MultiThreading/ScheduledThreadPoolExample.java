package MultiThreading;

import java.util.concurrent.*;

public class ScheduledThreadPoolExample {
    static void main(String[] args) {
        ExecutorService executor= Executors.newScheduledThreadPool(2);
        for(int i=1;i<=5;i++) {
            int id=i;
            executor.execute(() ->
            {

                System.out.println("task " + id + " getting executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

            });
        }
        executor.shutdown();
        ScheduledThreadPoolExecutor sp=new ScheduledThreadPoolExecutor(2);
        sp.schedule(()->{
            System.out.println("running");
        },3, TimeUnit.SECONDS);
        sp.scheduleAtFixedRate(()->
        {
            try
            {
                Thread.sleep(4000);
            }
            catch (InterruptedException e)
            {

            }
            System.out.println("bhagging");
        },3,2,TimeUnit.SECONDS);
        sp.shutdown();

    }
}
//with thread scheduler we get the opportunity to schedule thread delay them etc