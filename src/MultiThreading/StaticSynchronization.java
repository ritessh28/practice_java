package MultiThreading;

public class StaticSynchronization {
    public static void main(String[] args) {
        Demo obj=new Demo();
        Thread t1=new Thread(()->
        {
            Demo.m1();
        });
        Thread t2=new Thread(()->
        {
            Demo.m2();
        });
        t1.start();
        t2.start();
    }

}
class Demo
{
    public static synchronized void m1()
    {
        System.out.println("m1 method starts");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m1 method ends");
    }
    public static synchronized void m2()
    {
        System.out.println("m2 method starts");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m2 method ends");
    }
}
//so basically if we use synchronization in static method lock is not applied to object it is applied to the class
//or a specific synchronization block if we pass(classname.class) as parameter it becomes static synchronization