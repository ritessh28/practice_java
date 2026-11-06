package MultiThreading;

public class MultiThreadsMethods4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            while (!Thread.currentThread().isInterrupted())
                System.out.println("running");
        });
        t1.start();
        t1.sleep(2000);
        t1.interrupt();
    }

}
//interrupt:sends a signal to a particular thread that it should stop executing/doing what its doing default-->true