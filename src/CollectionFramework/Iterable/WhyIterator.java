package CollectionFramework.Iterable;

import java.util.*;

public class WhyIterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        List<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        System.out.println("linked List:");
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
        Set<Integer> s1=new LinkedHashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.add(700);
        System.out.println("linked hash set:");
        for(int i=0;i<s1.size();i++)
        {
//            System.out.println(s1.hashCode());
            System.out.println(s1.size());
//            System.out.println(s1.);
//            System.out.println(s1);
        }
        System.out.println("enhanced for loop");
        for(int i:s1)
        {
            System.out.println(i);
        }
        List<Integer> s2=new Stack<>();
        s2.add(10);
        s2.add(20);
        s2.add(30);
        s2.add(40);
        System.out.println("Stack list:");
        for(int i=0;i<s2.size();i++)
        {
            System.out.println(s2.get(i));
        }



    }
}
// the normal for loop is applicable for arraylist and suppose we use linked list the for loop
// it gives correct output but suppose if we use LinkedHashset  does not give output sequentially
// cause the data is stored in the form of hashcode and the order is not maintained that is the index is not maintained
// and even duplicated are not alllowed
// even stack stores data in same way as list but while retrieving we get the last element first
// because it follows LIFO technique addition and removal both take place from a single end itself
// if we need to print according to how stack stores element ie last first and then remaining after that
//  do we need to implement our own logic no java iterator interface implements the methods for iterating
// a collection of elements for all collection interface
// the flow
// Iterable interface=>collection interface=>set interface=>list interface=>queue
// so the basic idea of how iterator works is
// collection interface extends iterable interface and the other interface set queue and list interface extends
//collection interface so the class which implement collection needs to provide the method definition for all
// collection iterable and its set Interface
// collection  interface has a iterator reference
// Iterator<E> iterator();
//Returns an iterator over the elements in this collection.
// There are no guarantees concerning the order in which the elements are returned (unless this collection is an instance
// of some class that provides a guarantee).
//Returns:
//an Iterator over the elements in this collection
// for enhanced loop works as similar as Iterator