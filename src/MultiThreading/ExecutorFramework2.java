package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFramework2 {
    public static void main(String[] args) {
        //creates anew fixedThreadPool with 3 workers(thread)
        ExecutorService executor= Executors.newFixedThreadPool(3);

        //cannot store the result of submit directly cause Integer wants value directly to be assigned as the submit()
        //is asynchronous when it gets a worker to perform it task it returns a value
        //future integer  can be used here to get the future value the result of callable will be thrown in future reference
        //we can get the value through get() function
        //and get() blocks the thread on which it is running in our case main till the f1 gets the value and after that
        //only it executes that is the special thing of get()
        //callable is a interface similar to runnable, but it returns value which runnable doesn't
        Future<Integer>f1=executor.submit(()->{
            try {

                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            return 20;
        });
        try {
            System.out.println(f1.get());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        executor.shutdown();
    }
}
