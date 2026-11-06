package MultiThreading;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Box box=new Box();
        Thread t1=new Thread(()->{
            try
            {
                Thread.sleep(800);
            }
            catch (Exception e)
            {

            }
            box.producer(10);
        });
        Thread t2=new Thread(()->
        {
            try
            {
                Thread.sleep(300);
            }
            catch (Exception e)
            {

            }
            box.consumer();
        });
        t1.start();
        t2.start();

    }
}
class Box
{
    Integer item;
    boolean flag=false;
    public  void producer(Integer value)
    {
        item=value;
        flag=true;
        System.out.println("producer produced value is: "+item);
    }
    public void consumer()
    {
        System.out.println("consumed value is:"+item);
        item=null;
        flag=false;
    }
}
//so the famous problem of multithreading is producer-consumer problem so the description of this problem is a producer
//produces a value in one method and consumer consumes a value produced by the producer in another method
// and these methods are usually called with 2 different threads so if we start bith threads it may cause problem cause
// the execution of thread is non-deterministic it can run the consumer method first before executing the producer
// so consumer may get null value and due to context switching it may be completed halfway we may not get the result as
// expected and there can be multiple scenarios which cause problem due to concurrent execution of different threads
//even synchronized keyword cannot solve this problem cause it also dont provide the order of execution it just says that
//only one thread can enter the synchronized block at once and after its completion another thread can run so suppose
//if consumer runs first then everytime it will get null value onl