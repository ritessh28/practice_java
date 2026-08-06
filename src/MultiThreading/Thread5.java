package MultiThreading;

public class Thread5 extends Thread {
    public static void main(String[] args)
    {
        Thread5 t=new Thread5();
        t.start();
        System.out.println("main method");
        t.start();
    }
}

