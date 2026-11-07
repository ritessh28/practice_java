package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class StampedeLock {
    public static void main(String[] args) {
        SharedResource1 sr=new SharedResource1();
        Thread t1=new Thread(sr::read,"T1");
        Thread t2=new Thread(sr::read,"T2");
        Thread t3=new Thread(sr::read,"T3");

        Thread w1=new Thread(()->
        {
            sr.write(10);
        },"W1");
        Thread w2=new Thread(()->
        {
            sr.write(20);
        },"W2");
        Thread w3=new Thread(()->
        {
            sr.write(30);
        },"W3");

        w1.start();
        w2.start();
        w3.start();
        t1.start();
        t2.start();
        t3.start();

    }
}
class SharedResource1
{
    ReadWriteLock rw=new ReentrantReadWriteLock();
    StampedLock sl=new StampedLock();



    public int value=0;
    public void write(int newValue)
    {
        long stamp=sl.writeLock();
        try {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            value=newValue;
            System.out.println(Thread.currentThread().getName()+" changes value to "+newValue);

        }
        finally {
            sl.unlock(stamp);
        }

    }
    public int read()
    {
        long stamp=sl.tryOptimisticRead();
        int currentValue=value;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {

        }
        if(!sl.validate(stamp)) {
            stamp=sl.readLock();
        }
        try
        {
            currentValue=value;
        }
        finally
        {

                sl.unlock(stamp);
        }
        System.out.println(Thread.currentThread().getName() + "read value is " + currentValue);
        System.out.println(stamp);
        return currentValue;

    }
}