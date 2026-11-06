package MultiThreading;

public class MultiThreadsMethods5 {
    public static void main(String[] args) throws InterruptedException {
//        Thread t1=new Thread(()->
//        {
//            System.out.println(Thread.currentThread().getName());
//        });
//        System.out.println(t1.isAlive());//false as still start method is not called
//        t1.start();
//        System.out.println(t1.isAlive());//True
//        try
//        {
//            Thread.sleep(2000);
//        }
//        catch(InterruptedException e)
//        {
//
//        }
//        System.out.println(t1.isAlive());
        Thread t2=new Thread(()->
        {
            for(int i=0;i<=10;i++)
                System.out.println("T2 "+i);
        });
        Thread t3=new Thread(()->
        {
            for(int i=0;i<=10;i++)
                System.out.println("T3 "+i);
        });
        System.out.println(t2.getPriority());//bydefault 5
        System.out.println(t3.getPriority());
        t2.setPriority(10);
        t3.start();
        t2.start();
        t2.setName("worker2");
        Thread.sleep(2000);
        System.out.println(t2.getName());
//        t2.wait(2000);
    }
}
//isAlive returns a boolean(if still alive and running true/if still isn't started or terminated false)
//in setPriority if we set the priority high for a particular thread from a group of threads it is not guaranteed
// the thread with high priority will get executed first the order of execution is entirely dependent on cpu availability
//the operating system
//may respect the priority
//may partially respect
//may not at all
//we can even our defined name for a thread using setName function