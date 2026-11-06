package MultiThreading;

public class StaticSynchronizationAndObjectSynchronization {
    public static void main(String[] args) {
       Methods obj=new Methods();
        Thread t1=new Thread(()->
        {
            Methods.m1();
        });
        Thread t2=new Thread(()->
        {
           obj.m2();
        });
        t1.start();
        t2.start();
    }
}

class Methods
{
    public static synchronized void m1()
    {
        synchronized (Methods.class) {
            System.out.println("m1 method starts");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("m1 method ends");
        }
    }
    public synchronized void m2() {
        synchronized (this) {
            System.out.println("m2 method starts");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("m2 method ends");
        }
    }
}
//we can even use static Synchronization and object synchronization in a single class in two different methods as above
//we need to make one method as static for static s\n and one as non-static for object s\n as per our use case we can use that
