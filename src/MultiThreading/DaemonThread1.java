package MultiThreading;

public class DaemonThread1 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->
        {
            for(int i=1;i<=10000000;i++)
                System.out.println("T1 "+i);
        });
        t1.setDaemon(true);//by default true
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
//daemon threads are background running threads--> stops immediately once the main thread is completed executing
//if the order of execution of some other thread entirely depend till the main thread is  in runnable state then we can
//use daemon  threads
//real life example garbage collection works as daemon thread it is only available till the main method/thread is  in
//running state