package MultiThreading;

public class ThreadState {
    public  static void main(String[] args) throws Exception {
        Thread t1=new Thread(()-> System.out.println(Thread.currentThread().getName()));
//        t1.getState();
//        t1.start();
        System.out.println(t1.getState());//NEW
        System.out.println(Thread.currentThread().getName());//main
        t1.start();//Runnable
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        System.out.println(t1.getState());
        Thread.sleep(1000);//sleep state
        System.out.println(t1.getState());//Terminated state
    }
}
