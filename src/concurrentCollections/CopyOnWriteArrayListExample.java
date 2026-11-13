package concurrentCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        //enhanced version of add it adds the value only if the elemen/object value is not present otherwise add it
        list.addIfAbsent(10);
        System.out.println(list);
        List<Integer>l2=new ArrayList<>(List.of(10,20,30,40));
        //enhanced version of addAll it adds only the element with values which are not already present in the list
        //does not duplicate
        list.addAllAbsent(l2);
        System.out.println(list);



    }
}
