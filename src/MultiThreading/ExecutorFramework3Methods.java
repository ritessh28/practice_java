package MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorFramework3Methods {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //we can create a list with each element of type callable like below
        //to implement invokeAll which returns <T> List<Future<T>> so to store it in List<future<Integer> we are creating it
        List<Callable<Integer>>task=new ArrayList<>(
                List.of(()-> 10,
                ()->20,
                ()->30,
                ()->40));
        ExecutorService executor= Executors.newFixedThreadPool(3);
//        try {
//            System.out.println(executor.invokeAll(task));
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
        //creating list of future  integer as it generic cause we are returning integer value
        //invokeAll returns a list of future
        List<Future<Integer>> future;
        try {
            future = executor.invokeAll(task);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(Future<Integer> f:future)
        {
            System.out.println(f.get());
        }
//        System.out.println(future);
        executor.shutdown();
    }
}
