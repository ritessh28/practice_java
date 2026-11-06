package MultiThreading;

public class MultiThreadsMethods2 {
    static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for(int i=0;i<=10;i++) {
                System.out.println("T1 "+i);
                Thread.yield();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<=10;i++) {
                System.out.println("T2 :"+i);
                Thread.yield();
            }
        });
        t1.start();
        t2.start();
        t1.sleep(2000);

    }
}
//yield(static method):yield method gives the priority to execute other thread it just a suggestion to o/s that you can
//give my cpu time to someone who is ready to execute
//just a suggestion it does not directly gives responsibility of execution
//o/s may even reject this suggestion
//it is not guaranteed