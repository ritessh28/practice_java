package CollectionFramework.List;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer>l1=new ArrayList<>(List.of(10,20,30,40));
        ArrayList<Integer>al=new ArrayList<>(10);
        System.out.println(l1);
        l1.add(50);
        System.out.println(l1.get(0));
        l1.remove(0);
        l1.set(1,80);//set method replaces the value of the index provided
        System.out.println(l1);
        l1.add(1,70);// where as add with index adds the element to specified index
                                  // and the element after that index are shifted to the right by one
        System.out.println(l1);
//        System.out.println(l1.addAll(List.of(1,2,3,4)));
//        System.out.println("after add: "+ l1);
        l1.addAll(0,List.of(1,2,3,4));
        System.out.println(l1);
        //by default addAll adds group of elements at last one by one
        //overload method accepts index and add it to the specified index with shifting the remaining elements to the right
        l1.removeAll(List.of(1,2,3,4));
        //removeAll removes the elements provided in the argument not every element
        System.out.println(l1);
//        l1.clear();
        //clear removes all elements from the list
        System.out.println(l1);
        System.out.println(l1.indexOf(70));
        // accepts object as an argument as to find the index we need to traverse the entire list
        // equals method will be needed to check so to override the equals method
        System.out.println();
        ListIterator<Integer> listIterate=l1.listIterator();
        while(listIterate.hasNext())
        {
//            l1.add(900);cannot add element due to Concurrent modification
            System.out.println(listIterate.next());
        }
        System.out.println("**********");
        ListIterator<Integer>reverseIterator=l1.listIterator(5);
        while(reverseIterator.hasPrevious())
        {
            System.out.println(reverseIterator.previous());
//            reverseIterator.add(800);
//            l1.add(200);
        }
        // with the help of list iterator we can traverse the element from the last ie reverse
        //as passing the index as a parameter for list iterator constructor
        //we can even call methods like add and more as the list is sequenced
        List<Integer>l2=List.of(100,200,300,400);
//        l2.add(20);
        List<Integer>l3=List.copyOf(l2);
//        l3.add(300);


        // if we create list with List.of it creates a immutable list we cannot perform operation like
        // add remove etc as its immutable
        // even if we use copy of and store it in different list it creates a copy but it is also immutable
        al.ensureCapacity(100);
        al.trimToSize();
        System.out.println(al.size());




    }
}
