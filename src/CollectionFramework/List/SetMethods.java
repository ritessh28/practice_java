package CollectionFramework.List;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        Set<Integer>s1=new HashSet<>(10) ;
        //one constructor for hashset with initial capacity
        Set<Integer>s2=new HashSet<>();
        //one without parameters but the default capacity assigned is 16
        Set<Integer>s3=new HashSet<>(10,0.75f) ;
        //one with initial capacity and load factor
        Set<Integer>s4=new HashSet<Integer>(List.of(10,20,30,40,50)) ;
        //one with directly assigning set values as above
        System.out.println(s4);
        System.out.println(s4.contains(30));
        s4.add(90);
        System.out.println(s4);
        System.out.println(s4.hashCode());
        System.out.println(s4.retainAll(List.of(10,20,30)));
        System.out.println(s4);


    }
}
