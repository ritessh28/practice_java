package MultiThreading;

public class VisibilityProblem {
    public static boolean flag=false;
    public static volatile boolean flag2=false;
    public static void main(String[] args) {
        Thread t1=new Thread(()->
        {
            while (!flag2)//while (!flag)
            {
                System.out.println("running");
            }
        });
        Thread t2=new Thread(()->
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flag=true;
            flag2=true;
            System.out.println("thread 2 finished");

        });
        t1.start();
        t2.start();
    }
}
//basically in this example suppose t1 and t2 run on different CPU's, and they have their own cache memory even though even
//if multiple cpus  are present it operates on a single main cpu only and other cpu can be treated as cores which
//may differ from computer to computer so the problem of visibility is that changes made in one thread are not visible to
//another thread suppose in our example  t1 has started executing and printing a statement infinitely until the condition is false
//and thread 2 is in sleep(timed waiting state)for 1 sec after that the flag is assigned with true even though it has assigned
//true the changes are done in it cache not in t1 cache and while t1 is reading for flag it reads from its cache not
//from the Ram  so it gets false always cause it doesn't know some other thread has changed the value of flag behind
//it back so this is the visibility program
//important point :because Sout is synchronized so it reads value from ram in t1 thread so we wont see the problem
//if we keep the loop empty we can observe that it does not stop only as the value of flag is false
//to solve this we can use volatile keyword which defines that always read values from the RAM whether it may be for
//2 thread or multiple threads always from RAM to solve the problem of visibility
//solve the problem of visibility and reordering
// imp it does not solve critical section
//problem because in critical section the value is already read even if the updated value is present but it has already read
//and continue execution form where it stopped so synchronized keyword is a solution here
//which states that when a thread is exeuting/acquiring a critical section it applies lock mechanism so the other thread
//wont be able the critical section till the thread execution is completed the thread which wanted to acquire the cs
//goes in blocked state till the execution of current thread so by this we completely solve race condition