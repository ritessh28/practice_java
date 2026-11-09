package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newSingleThreadExecutor();
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
//when we run the program we can see that all the task will be executed by a single thread itself
//there is no size or queue at all cause only one single thread is present