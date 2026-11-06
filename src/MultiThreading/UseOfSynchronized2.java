package MultiThreading;

import com.sun.source.doctree.SinceTree;

public class UseOfSynchronized2 {
    static void main(String[] args) throws InterruptedException {
        PrintSomething1 obj=new PrintSomething1();
        PrintSomething1 obj2=new PrintSomething1();
        Thread t1=new Thread(()->
        {

            System.out.println("T1 thread starts");
            obj.print();
            System.out.println("T1 thread ends");

        });
        Thread t2=new Thread(()->
        {
            System.out.println("T2 thread starts");
            obj2.print();
            System.out.println("T2 thread ends");

        });
        t1.start();
        t2.start();
        Thread.sleep(4000);
        System.out.println("value of count is "+obj.cnt);
    }
}
class PrintSomething1
{
    int cnt=0;
    public synchronized void print()
    {
        System.out.println("print method");
        for(int i=1;i<=10000;i++)
        {

            System.out.println(Thread.currentThread().getName()+" "+i);
            this.increment();
        }
        System.out.println("print method ends");
    }
    public synchronized void increment()
    {
        cnt++;
    }

}
//as lock is applied to object if we create two object of a particular class and call a method even if it is synchronized
//if we call the method with two different object the sequence of execution is not ordered cause even though lock is applied
//to one object but we are calling we are calling the common method with another object so another object's lock is different
//both can run parallel we may not get the result as expected sequentially cause both are running parallel