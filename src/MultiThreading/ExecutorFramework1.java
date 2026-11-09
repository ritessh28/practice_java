package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework1 {
    public static void main(String[] args) {

        //ExecutorService implements autocloseable and Executor
        //Executors class provides Factory and utility methods for Executor, ExecutorService, ScheduledExecutorService,
        //here newFixedThreadPool is a static method which returns an instance of ExecutorService itself
        //it has multiple factory and utility method which return instances
        ExecutorService executor= Executors.newFixedThreadPool(2);

        //here we are not using the value of i directly cause as loop is outside the runnable implementation through lambda
        //as variables declared inside  lambdas should not be final or effectively final but we are changing the value of i for every iteration
        //and i is outer variable declared outside and not inside lambda so we cannot use changing outside variable value
        //inside a lambda we can use it if it is effectively final but as its changing cannot be used
        //but variables declared inside lambda can be changed inside lambda we can use it
        //with id a helper variable which gets fresh value everytime of i when it gets incremented
        //as it is not getting incremented rather assigned every time the loop runs it gets fresh variable and is effectively final
        // so it is accepted
        //The "effectively final" rule only applies when a lambda tries to reach outside of itself to grab a variable
        // from the enclosing method
        for(int i=1;i<=5;i++) {
            int id=i;
            executor.execute(() ->
            {
                System.out.println("task "+id+ " is performed by "+Thread.currentThread().getName());
            });
        }

        //here we can use it directly inside lambda because the scope of i only within the lambda it does the job and
        //gets destroyed as outer variable may be used my some other methods or to perform some operations as it is
        //getting changed the other method may not get the result/value as expected so this is not allowed
        executor.execute(() ->
        {
            for(int i=1;i<=5;i++) {
                System.out.println("task " + i + " is performed by " + Thread.currentThread().getName());
            }
        });
        executor.shutdown();
    }
}
