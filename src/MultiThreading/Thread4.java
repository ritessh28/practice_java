package MultiThreading;
class Child extends Thread
{
    public void start()
    {
        super.start();
        System.out.println("start method of child class");
    }
    public void run()
    {
        System.out.println("child class run method");
    }
}
public class Thread4 {
 public static void main(String[]args)
 {
     Child obj=new Child();
     obj.start();
    System.out.println("main method");

 }
}
