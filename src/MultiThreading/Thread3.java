package MultiThreading;
class Parent extends Thread
{
    public void run()
    {
        System.out.println("no arg m1 method");
    }
    public void run(int i)
    {
        System.out.println("int arg m1 method");
    }
}
public class Thread3 {
    public static void main(String[] args)
    {
        Parent p1 = new Parent();
        p1.start();

    }
}
