package completableFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        for (int i = 1; i <= 20; i++) {
            executor.submit(() -> {
                System.out.println("task is executed by "+Thread.currentThread());


            });
        }
        Thread.sleep(2000);
    }
}
