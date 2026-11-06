package MultiThreading;

public class DemoToMt {
    public static void main(String[] args) {
        CreatingThread obj=new CreatingThread();
        obj.start();
//        obj.start();//error


    }
}
class CreatingThread extends Thread
{
    public void run()
    {
        System.out.println("inside new thread");
    }
}
//there are 2 ways by which we can create threads
//by extending Thread class and by implementing Runnable interface
//Thread class also implements runnable interface but its empty with no statements
//start() method is present in Thread class which can be called only once
//to provide our implementation of run method we need to override it in either by extending thread class and providing
//implementation or implementing runnable interface and compulsory overriding run() method
//start()-->jvm asks operating system  to create a new thread->>allocates/thread gets  stack and program counter space
// --> thread execute run