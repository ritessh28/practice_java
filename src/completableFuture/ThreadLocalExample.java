package completableFuture;

public class ThreadLocalExample {
    public static ThreadLocal<String>name=new ThreadLocal<>();
    public static void main(String[] args) {
        Thread t1=new Thread(()->
        {
            name.set("shankar");
            System.out.println(name.get());
        });
        Thread t2=new Thread(()->
        {
            System.out.println(name.get());
        });
        t1.start();
        t2.start();
        System.out.println(name.get());
    }
}
