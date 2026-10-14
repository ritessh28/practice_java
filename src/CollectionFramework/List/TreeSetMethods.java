package CollectionFramework.List;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer>set=new TreeSet<>();
        set.add(10);
        set.add(90);
        set.add(20);
        set.add(60);
        set.add(50);
        set.add(5);
        System.out.println(set);
        System.out.println(set.first());
        //prints the first value or smallest value  present in tree
        System.out.println(set.last());
        //last value or larger value
        System.out.println(set.headSet(89));
        //prints the values lower that specified value
        System.out.println(set.tailSet(50));
        //prints the values greater than specified value and the value itself
        System.out.println(set.floor(80));
        //returns the value less than specified or same if present
        System.out.println(set.ceiling(6));
        //returns the value more  than specified or same if present
        System.out.println(set.subSet(5,60));
        //includes the first parameter and excludes the second parameter
//        System.out.println(set.first(10));
//        System.out.println(set.getFirst());
        //methods of navigable set
        System.out.println(set.pollFirst());
        //pollFirst removes first element from the set
        //similarly last removes the last element from the set permanently
        System.out.println(set);
        System.out.println(set.headSet(90,true));
        System.out.println(set.tailSet(10,false));
        System.out.println(set.subSet(20,true,90,false));
        //basically methods of navigable set provides more flexibility then sorted set
        //to retrieve particular element and use inclusive
        Iterator<Integer>it=set.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
