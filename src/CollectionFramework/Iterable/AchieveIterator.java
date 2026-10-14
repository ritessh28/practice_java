package CollectionFramework.Iterable;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AchieveIterator {
    public static void main(String[] args) {
        Set<String> o1=new LinkedHashSet<>();
        o1.add("ritesh");
        o1.add("shreyash");
        o1.add("rohit");
        o1.add("amit");
//        Iterator<String> itr=o1.iterator();
        // Iterator<String> is an interface reference.
        // o1.iterator() returns an object of LinkedHashSet's internal iterator class,
        // which implements Iterator. This works because LinkedHashSet implements Set,
        // Set extends Collection, and Collection extends Iterable,
        // which declares the method iterator() with a generic type parameter <T>.
        Iterator<String> itr = o1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }



    }
}
