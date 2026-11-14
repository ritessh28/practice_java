package concurrentCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteALUpdationEx implements Runnable {
    static CopyOnWriteArrayList<String>list=new CopyOnWriteArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        list.add("ritesh");
        list.add("sujal");
        CopyOnWriteALUpdationEx obj=new CopyOnWriteALUpdationEx();
        Thread t1=new Thread(obj);
        t1.start();
        Iterator<String>it=list.iterator();
        while(it.hasNext())
        {
            System.out.println("main thread iterating list:"+it.next());
            Thread.sleep(2000);
//            if(it.next()=="sujal") {
//                it.remove();
//            }
        }
        System.out.println(list);



    }
    public void run()
    {
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("updating list from child thread");
        list.add("ramesh");
    }
}
//in the above example we can see that we were able to modify the list with one thread while other thread was iterating
//through the list of elements this is not possible in normal list because only one thread is allowed to modify the list while it
//is iterating so as the name suggest it CopyOnWriteArraylist it creates a separate cloned copy of actual list for
// every update operations such as add remove set and at some point the updated value gets adds to the actual list it just
//creates a snapshot for every update operation and do changes in  that cloned copy and at last merges it
