package MultiThreading;
public class ProducerConsumerProblemLoop {
    public static void main(String[] args) throws InterruptedException {
        Box1 box=new Box1();
        Thread t1=new Thread(()->{
            for(int i=1;i<=20;i++) {
                box.producer(i);
            }
        });
        Thread t2=new Thread(()->
        {
            for(int i=1;i<=20;i++) {
                box.consumer();
            }
        });
        t1.start();
        t1.join();
        t2.start();

    }
}
class Box1
{
    Integer item;
    boolean flag=false;
    public synchronized void producer(Integer value)
    {
        item=value;
        flag=true;
        System.out.println("producer produced value is: "+item);
    }
    public synchronized void consumer()
    {
        System.out.println("consumed value is:"+item);
        item=null;
        flag=false;
    }
}
//even though we use synchronized as they are two different methods they run parallel so still we dont get the result as
// expected and if we use join also it will completely run one method first suppose producer after completing we will
// get lastly updated value which is 20 but we need to consume just after producing not at last
