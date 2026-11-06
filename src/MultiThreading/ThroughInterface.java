package MultiThreading;

public class ThroughInterface implements Runnable {
    public static void main(String[] args) {
        Thread t1=new Thread(new ThroughInterface());
        Thread t2=new Thread(()->
        {
            for(int i=0;i<10;i++)
                System.out.println("T2 "+i+" ");
        });
        t2.start();
        System.out.println("main method");
        t1.start();



    }
    public void run()
    {
        for(int i=0;i<20;i++)
            System.out.println("T1 "+i+" ");
    }
}
//to implement thread functionality/create new thread basically it is recommended to use Runnable interface cause of
//1, reusability
//2, support functional programming as Runnable is FunctionalInterface we can directly pass lambda or method reference
//     where runnable is required
//3. supports multiple inheritance as we can implement multiple interface but can extend only one class
//4. if we run multiple threads at once the order of execution isn't guaranteed cause based on the cpu it is executed