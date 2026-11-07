package MultiThreading;

import java.util.Locale;
import java.util.concurrent.locks.*;

public class ReadWriteLock1 {
    public static void main(String[] args) {
        SharedResource sr=new SharedResource();
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
        t1.start();
        w2.start();
        t2.start();
        w3.start();
        t3.start();




    }
}
class SharedResource
{
    ReadWriteLock rw=new ReentrantReadWriteLock();
    Lock r1=rw.readLock();
    Lock w1=rw.writeLock();

    public int value=0;
    public void write(int newValue)
    {
        w1.lock();
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
            w1.unlock();
        }

    }
    public int read()
    {
        r1.lock();
        try {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {

            }
            System.out.println(Thread.currentThread().getName()+"read value is "+value);
            return value;
        }
        finally {
            r1.unlock();
        }
    }
}
//ReadWrite Lock is an interface  which has 2 methods
// readLock and writeLock both returns Lock type object
// so to call these methods we need to create instance of ReadWrite interface with the help of ReentrantReadWriteLock class
// which has implementation of Readwrite interface that is this class has implemented read write interface
// so why 2 methods are present because read write is useful in a situation where reading and writing is required
// from resources such as database file and caches so while reading we can read multiple values at once meaning multiple thread
// can read the value at once because its just reading not modifying so there wont be race conditions but if multiple
// threads try to write at once we can face race condition problem as in increment function, but we can use volatile keyword
// for increment function but its just for a single value In resources ,multiple shared resource may be present so
// to avoid these problems we have two different lock readLock(SharedLock) cause if multiple threads read at the same time
// problem may not occur but writing can cause race condition so to avoid this we have WriteLock(exclusiveLock) only
// one thread holds a lock at a time not multiple due to certain reasons after fully completing the execution of current
// thread another thread cannot enter

