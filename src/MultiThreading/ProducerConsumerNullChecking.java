package MultiThreading;

public class ProducerConsumerNullChecking {
    public static void main(String[] args) throws InterruptedException {
        Box2 box=new Box2();
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
        t2.start();

    }
}
class Box2 {
    volatile Integer item;
    volatile Boolean flag = false;

    public void producer(Integer value) {
        while (flag == true) {
            //do nothing
        }
        item = value;
        flag = true;
        System.out.println("producer produced value is: " + item);
    }

    public void consumer() {
        while (flag == false) {

        }
        System.out.println("consumed value is:" + item);
        item = null;
        flag = false;
    }
}
//it does not solve the problem as it may go not go in  infinite loop because volatile is used it reads everytime
// the updated value not from its cache but waste of cpu time due to loops running continuously  or race condition  problem