package MultiThreading;

public class MultiThreadsMethods23 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main program Starts");
        Thread t1=new Thread(()->{
            for(int i=0;i<=10;i++)
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T1 "+i);
            }
        });
        t1.start();
//        Thread.currentThread().sleep(2000);
        System.out.println("main program ends");    }
}
