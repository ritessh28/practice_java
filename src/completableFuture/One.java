package completableFuture;

import java.util.Vector;
import java.util.concurrent.CompletableFuture;

public class One {
    public static void main(String[] args) {
        CompletableFuture<Integer>f1=
                //supplyAsync takes a supplier which does not accept value and return a value
                CompletableFuture.supplyAsync(()->10)
                        //thenAccept accepts a consumer meaning it does not return a value but can accept one
//                        .thenAccept((result)-> System.out.println("value is "+result*10))
                        //thenApply takes a function which takes a value of particular type and returns it
                        .thenApply((n)->n*10);


        CompletableFuture<Void>f2=
                //runAsync take a runnable
                CompletableFuture.runAsync(()-> System.out.println("running"));

        CompletableFuture<Void>c1=
                CompletableFuture.supplyAsync(()->10)
                        .thenApply((n)->n*10)
                        .thenApply((s)->s/2)
                        .thenAccept((ans)-> System.out.println("answer is "+ans));

        CompletableFuture<Integer>r1=
                CompletableFuture.supplyAsync(()->6)
                        .thenApply((s)->s+10);

        CompletableFuture<Integer>r2=
                CompletableFuture.supplyAsync(()->10);

        //we can even combine result of two completable in a single using thenCombine
        //which accepts two arguments one completion stage and second biFunction(v1,v2)
        //biFunction to define how to add two operations
        CompletableFuture<Void>res=r1.thenCombine(r2,(a,b)->a-b)
                .thenAccept((result)-> System.out.println(result));



    }
}
//Completable Future class is a enhanced version of future interface as it contains some method which does not block the
//main thread execution and does operation asynchronously and even we can do multiple chaining just like streams
//to get the desired result. result of one operation can be passed as input to other operation
//Completable Future follows fork join pool concept bts we do not need to create implicitly a executor for running
//our task as we did in Executor service such as newThreadPool cachedPool etc
//the chaining methods do not block the main thread from executing