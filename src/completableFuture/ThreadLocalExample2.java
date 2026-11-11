package completableFuture;

public class ThreadLocalExample2 {
    static void main(String[] args) throws InterruptedException {
        //creating instance of myRunnable class
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
class MyRunnable implements Runnable
{
    ThreadLocal<Integer>threadLocal=ThreadLocal.withInitial(()->0);
    public void run()
    {
        System.out.println(threadLocal.get());//initial value 0 if not set
        try
        {
            threadLocal.set((int) (Math.random() * 100));
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {

        }
        System.out.println(threadLocal.get());
    }
}
//in the above example even though we have created a single instance of MyRunnable class and 2 threads are created by passing
//the same runnable object the shared object/variable may cause race condition while writing to shared variable or visibility
//problem when reading but as in our example the shared object is of type ThreadLocal it creates separate objects for each thread
//not for an object so the thread which holds a variable of threadLocal is ony able to read and write to that variable
//this shared reference is hidden from other threads each threads may have their own variable or reference that is the reason
//why we don't get race conditions in our program if it was normal class/object shared reference then other thread may have override
//because same instance is used in both the threads
