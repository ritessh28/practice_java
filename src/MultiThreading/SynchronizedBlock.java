package MultiThreading;

public class SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        Counter1 obj=new Counter1();
        Thread t1=new Thread(()->
        {
            obj.increment();
        });
        Thread t2=new Thread(()->
        {
            obj.increment();
        });
        t1.start();
        t2.start();
        Thread.sleep(4000);
        System.out.println("count of variable is:"+obj.cnt);

    }

}
class Counter1
{
    int cnt=0;
    public void increment()
    {
        synchronized (this) {
            for(int i=1;i<=10000;i++) {
                cnt++;
            }
        }
//        synchronized (this)
//        {
//            cnt++;
//        }
    }
}
//use case of synchronized block is more as it can be used to synchronize only some part of method which may cause race
//condition or can say the part of method which is critical like in our program only cnt variable is treated as critical
//section so for that part we can use synchronized block
// synchronized(object name) syntax
// because if we apply synchronized to entire method it may cause more overhead as synchronized is costly
//so better ti use synchronized blocks were needed not everywhere
//we can even create our own locks on objects every object has an internal lock