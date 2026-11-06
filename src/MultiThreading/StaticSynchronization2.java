package MultiThreading;

public class StaticSynchronization2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->
        {
            Counter2.increment();
        });
        Thread t2=new Thread(()->
        {
            Counter2.increment();
        });
        t1.start();
        t2.start();
    }
}
class Counter2
{
    static int count=0;
    public static void increment()
    {
        System.out.println("increment method started ");
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {

        }
        synchronized (Counter1.class) {
            count++;
            System.out.println("count is "+count);
        }
    }

}
//in the above example we can see that static synchronization is used with  static method and static variables and in the
//parameter we have passed Counter.class so lock is applied to class rather than object cause of static