package CollectionFramework.Iterable;

import java.util.*;

public class CollectionClassMethods {
    public static void main(String[] args) {
        Collection<Integer> l1 = new ArrayList<>();
//        l1.add(10);
//        l1.add(20);
//        l1.add(30);
//        l1.add(40);
        System.out.println(l1.isEmpty());
        //boolean isEmpty();
        System.out.println(l1.contains(10));
        //boolean Contains(Object o)
        //it accepts object as an argument because equals method is present in Object class
        //and arraylist class has override equals method according to its requirement
        // so object as a parameter accepts any type of object
//        boolean b = l1.add(10);
//        System.out.println(b);
//       boolean add<E>(E e)
//        l1.add("ss");
        // add returns true if the value was added otherwise false
        boolean b1 = l1.remove(90);
        System.out.println(b1);
        //boolean remove(Object o)
        // takes object as a parameter because of equals method to check if the specified object is present in list or not
        // if yes returns true otherwise false
//        Object[] arr=l1.toArray();
//        for(Object o:arr)
//        {
//            System.out.println(o);
//        }
        //Object[] toArray();
        //return Object array so should be stored in object array itself cannot call class
        // specific methods need to downcast
        Integer []arr1=l1.toArray(new Integer[0]);
        for(Integer i:arr1)
        {
            System.out.println(i);
        }
        //  <T> T[] toArray(T[] a);
        // another overloaded method for toArray which accepts array with generic type
        // and returns array with the array with provided generic type in the above example returns integer array
        l1.addAll(List.of(1,2,3));
        System.out.println(l1);
//        boolean addAll(Collection<? extends E> c);
        // add all the elements provided in the list
        //it accepts Collection<? extends E> cause we can add elements of E or its subtype suppose
        // E is Number we can even add its subclass Integer or Double
//        l1.removeAll(List.of(1,2));
        //boolean removeAll(Collection<?> c);
        //removes all the element provided in the parameter
        System.out.println(l1);
        l1.retainAll(List.of(1,2));
        //retain all does intersection reverse of removeAll
        // keeps the parameters provided elements and remove the remaining
        System.out.println(l1);
        //collection interface has override toString() method
         l1.clear();
        System.out.println(l1);
        // empties the content in a collection
        //equals and hashcode are overriden by collection interface
        //






    }
    class Employee
    {
        int id=100;
    }

}
