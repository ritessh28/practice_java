package concurrentCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUpdation implements Runnable {
    static ConcurrentHashMap<Integer,String>map=new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {
        map.put(101,"ritesh");
        map.put(102,"sam");
        ConcurrentHashMapUpdation obj=new ConcurrentHashMapUpdation();
        Thread  t1=new Thread(obj);
        t1.start();
        Set<Integer>s1=map.keySet();
        Iterator<Integer>it=s1.iterator();
        while(it.hasNext())
        {
            System.out.println("main thread running iterator current object is:"+map.get(it.next()));
            Thread.sleep(2000);

        }
        System.out.println(map);

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
        System.out.println("child thread updating map");
        map.put(101,"ramshankar");
    }
}
//in the above example even though we are using iterator to print the value (performing operation) in one thread another thread can be able to modify
//the value inside map because it is concurrent hash map and lock is applied to specific  buckets only and for write operation
// simultaneously 16 operation can done because the concurrent level is 16 and initial capacity is also 16 so 16 write
//operations on different buckets can happen at once by 16 different threads and for reading it can be any number of threads
// the lock instead of whole map