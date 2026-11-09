package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newCachedThreadPool();
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
    }
}
//cachedThreadPool does not have a limit for thread whenever it sees a new task it creates separate thread for each independent
//task there is no concept of queue
//when we run the  above program each task gets a separate thread for execution