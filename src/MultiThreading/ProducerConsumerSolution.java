package MultiThreading;

import java.util.concurrent.locks.Lock;

public class ProducerConsumerSolution {
    public static void main(String[] args) {
        Box4 box=new Box4();
        Thread t1=new Thread(()->
        {
            for(int i=1;i<=20;i++)
            {
                try {
                    Thread.sleep(200);
                    box.producer(i);
                }
                catch (InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        });
        Thread t2=new Thread(()->
        {
            for(int i=1;i<=20;i++)
            {
                try {
                    Thread.sleep(200);
                    box.consumer();
                }
                catch (InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        });
        t1.start();
        t2.start();
    }
}
class Box4
{
     Integer item;
     Boolean flag=false;
    public synchronized void producer(Integer value) throws InterruptedException {
        while(flag==true)
        {
            wait();
        }
        item=value;
        flag=true;
        System.out.println("produced value is "+item);
        notify();
    }
    public synchronized void consumer() throws InterruptedException {
        while(flag==false)
        {
            wait();
        }
        System.out.println("consumed value is "+item);
        item=null;
        flag=false;
        notify();
    }
}
//solution to this problem
//use wait in producer inside loop till the flag is true(condition) cause suppose if the flag is already true and it enters
// the producer method body it assign/add new value in item and the previous value is overwritten so to avoid that check
// condition that only if the flag is false meaning value is not present/null then only add value so what wait()
// basically does is release the monitor lock from a object and put the thread in waiting state it stays until another thread
// wakes it up using notify
// it wakes up the thread and change it state from waiting to blocked state not running because again after waiting
// it should apply lock and start execution from where it left that is in loop so blocked state
// once it gets cpu time it can move from blocked state to running state so basically when other thread removes lock
// and is present in waiting state this thread can run
// similarly for consumer also we can use wait() and notify wait when the flag==false cause a producer still has not produced
// a value and notify similarly
// we can use volatile keyword so it freshly updated value every time
