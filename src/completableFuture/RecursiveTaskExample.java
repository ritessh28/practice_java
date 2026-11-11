package completableFuture;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskExample {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        //creating object of ForkJoinPool
        ForkJoinPool fp=new ForkJoinPool(3);
        //instance/object of sum task
        SumTask task=new SumTask(arr,0,arr.length-1);
        //calling invoke method of ForkJoinPool which takes forkJoinTask as argument
        System.out.println("answer is :"+fp.invoke(task));
        fp.shutdown();




    }
}
//class RecursiveTask<V> extends ForkJoinTask<V> is a class which performs a task recursively and return the result
//RecursiveAction also extends ForkJoinTask it also does the same thing but does not return a value
class SumTask extends RecursiveTask<Integer>
{

    private int []arr;
    private int start,end;
    public SumTask(int []arr,int start,int end )
    {
        this.arr=arr;
        this.start=start;
        this.end=end;
    }
    //abstractMethod in RecursiveTask which we need to implement according to our requirement in our case we are
    //dividing an array into two parts at first and then dividing further if the elements are more and combining the
    //result of multiple subtask as a single variable and returning it basically the sum of all elements
    @Override
    protected Integer compute() {
        //base condition to calculate sum and do not further divide
        if(end-start<=2)
        {
            int sum=0;
            for(int i=start;i<=end;i++)
            {
                sum=sum+arr[i];
            }
            return sum;
        }
        //calculating the mid-value to divide it in two parts
        int mid=(start+end)/2;

        //creating instance of (SumTask) (leftTask) using the SumTask class itself cause it extends Recursive task
        //to call methods of Recursive task and again check base condition and divide further if needed this repeat
        //recursively till the base condition is meet
        SumTask leftTask=new SumTask(arr,start,mid);

        //similar for right task
        SumTask rightTask=new SumTask(arr,mid+1,end);

        //fork() pushes the task directly onto the current worker thread's
        //own work-stealing queue (specifically, a double-ended queue or WorkQueue deque).
        //in our case we are using forkJoinPool which has invoke method in it which takes forkJoinTask instance as an argument
        //as our SumTask class has implemented RecursiveTask which extends forkJoinTask so as parent class can hold child class
        //instance we can pass instance of SumTask as argument and get our work done recursively
        leftTask.fork();

        //calling the compute method to perform addition and if it further needs division it can be done
        int sum2=rightTask.compute();
        System.out.println(sum2);

        //calling join on current thread blocks the next statements in the block to be executed till left task completes
        //its work, and it does not block any other thread from executing a task
        int sum1=leftTask.join();
        System.out.println(sum1);

        //returning sum of both tasks combined
        return sum1+sum2;

    }
}
//so the example above can be done with single thread also like normal divide and conquer approach but it would work on single
//main thread itself so after completing the left task recursively then only we would do the right task recursively and combine
//them get the result, but instead we are using multiple threads to do the work for ous and after that we combine the result from
//2 threads we are using fork join pool to perform this task and recursiveTask class which has a abstract compute method we
//need to implement so we can show what task need to implement recursively adding a base condition is mandatory for calculations
//otherwise it would never stop and keep dividing the array into sub parts recursively in our case if less than 3 values
//are present we do the sum of them a base condition