package MultiThreading;

public class UseOfSynchronized1 {
    static void main(String[] args) {
        PrintSomething obj=new PrintSomething();
        Thread t1=new Thread(()->
        {

            System.out.println("T1 thread starts");
            obj.print();
            System.out.println("T1 thread ends");
            obj.print2();

        });
        Thread t2=new Thread(()->
        {
            System.out.println("T2 thread starts");
            obj.print();
            System.out.println("T2 thread ends");
            obj.print2();

        });
        t1.start();
        t2.start();
    }
}
class PrintSomething
{
    public synchronized void print()
    {
        System.out.println("print method");
        for(int i=1;i<=100;i++)
        {

            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        System.out.println("print method ends");
    }
    public synchronized   void print2()
    {
        System.out.println("print 2 method");
        for(int i=1;i<=100;i++)
        {

            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        System.out.println("print method ends");
    }
}
//synchronized keyword is used to handle critical section and solve problems such as race condition,visibility,reordering etc
//important point it applies lock to the object of the class where we have use synchronized keyword by default every object has
//an internal lock provided by jvm it does not get applied to only specific methods
//with creating different object of a particular class we can run two threads parallel even if they are synchronized
//cause two different object can have two different locks so for running one thread we can use one object (lock) and
//different for another