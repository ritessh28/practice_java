package concurrentCollections;

import java.util.*;

public class CauseOfConcurrentModificationException implements Runnable {
    static List<String> list=new ArrayList<>();
    public void run()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Child thread updating list");
        list.add("c");
    }
    public static void main(String[] args) throws InterruptedException {
        list.add("a");
        list.add("b");
        Iterator<String>it=list.iterator();
        CauseOfConcurrentModificationException obj=new CauseOfConcurrentModificationException();
        Thread t1=new Thread(obj);
        t1.start();

        while (it.hasNext())
        {
            System.out.println("main thread running iterator current object in the list is:"+it.next());
//            Thread.sleep(3000);
        }


    }
}
//so the issue with normal collection  while it is iterating  that only a single thread can update ie remove or add
// to a collection at a time suppose in the main thread we have created a iterator for iterating over the list of elements
// in arraylist and printing them and even we have created a thread called t1 and started it using start() in its implementation
// we are adding a element in list while it's iterating as it have a mod-count and if any changes done directly could affect
// the count  iterator got while creating it and even only single thread can have access to modification at a time while
//its iterator is active and even if its working in single thread if we perform modification to list while iterator is
//running we get ConcurrentModificationException
//While an iterator is active, any structural change to the list (add or remove) that doesn’t go through the iterator itself changes
// modCount, and the iterator’s next next() call throws ConcurrentModificationException
//normally multiple thread can access a collection at a time while its iterator is not active and that is why we get
//race conditions problem and all