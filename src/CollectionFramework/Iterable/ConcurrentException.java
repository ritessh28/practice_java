package CollectionFramework.Iterable;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.*;

public class ConcurrentException {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        Iterator<Integer>it=l1.iterator();
        while(it.hasNext())
        {
            int value=it.next();
//            System.out.println(it.next());
            if(value==3)
            {
               l1.remove(value);
            }
            System.out.println(value);
        }
//        for(Integer i:l1)
//        {
//            System.out.println(i);
//            l1.remove(i);
//        }
        // cannot remove element directly from the list cause when we create a iterator it gives the count of element present
        // inside the list so suppose one element gets removed the count while creating list iterator does not match
        // so we get concurrent modification exception
        /*The for-each loop uses an Iterator behind the scenes. ArrayList keeps a modCount counter that increases on every
        structural change. The iterator remembers the count when it was created, and on each next() it checks that the
        counts still match. If they don’t, it throws. This is the fail-fast behavior*/
        List<String>names=new ArrayList<>(List.of("RITESH","RAMESH"));
        Iterator<String>is=names.iterator();
        for(String s:names)
        {
            names.remove(0);
            System.out.println(s);
        }


    }
}
/*Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 30 out of bounds for length 4
at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
at java.base/java.util.Objects.checkIndex(Objects.java:365)
at java.base/java.util.ArrayList.remove(ArrayList.java:552)
at CollectionFramework.Iterable.ConcurrentException.main(ConcurrentException.java:20)*/
// also known as fail fast
