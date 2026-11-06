package MultiThreading;

public class ThreadMethods1 {
    public static void main(String[] args) throws Exception {
        System.out.println("main method starts");
        Thread t1=new Thread(()->{
            for(int i=0;i<=10;i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            }
        });
//        Thread t2=new Thread(()->{
//            for(int i=0;i<=10;i++)
//            {
//                System.out.println("T2 "+i);
//            }
//        });
//        t2.join(2000);
//        t1.start();
//        t1.join();
//        t2.sleep(2000);
        t1.start();
        t1.join(2000);
        System.out.println("main method ends");


    }

}
//methods covered
//1.sleep ():keeps the thread in timed waiting state based on the millisecond we provide other threads can continue its execution
//2.join():has one 2 overload method one without parameter and one wth millisecond as argument in the empty parameter more
//priority is given to that thread to execute first and after that remaining statements and ms as parameter means
//it is given priority for that much of time if it executes its fine otherwise next statements are executed