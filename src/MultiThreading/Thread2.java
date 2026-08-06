package MultiThreading;
class ThreadDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("run method fo thread");
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        for (int i = 0; i < 10; i++)
        {
                System.out.println("main method");
        }

    }
}