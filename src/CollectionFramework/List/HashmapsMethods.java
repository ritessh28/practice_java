package CollectionFramework.List;

import java.util.HashMap;
import java.util.*;

public class HashmapsMethods {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"ritesh");
        map.put(102,"shnaka");
        map.put(103,"rohit");
        map.put(104,"vikas");
        //put method adds as new entry if the specified key is not present in map
        //if key exits it replaces the value we provide in the value parameter and returns the value of replcaed value
       // System.out.println(map.put(103,"ramesh"));//returns rohit as the value rohit was previously present before replacing
        System.out.println(map.values());
        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(103));//0(1) due to hashing key
        System.out.println(map.containsValue("ritesh"));//0(log n)
        System.out.println("000000000");
        System.out.println(map.putIfAbsent(109,"adill"));
        //enhanced version of put map.PutIfAbsent it adds if the object does not exist or does not add
        System.out.println(map);
//        Integer it=map.keySet();
        Set<Integer>it=map.keySet();
        for(Integer i:map.keySet())
        {
            System.out.println(i);
        }
        //keyset returns the keys present in a map
        //it returns a set because keys are unique and set does not allow duplicates as both satisfy same so set
        System.out.println(it);
        System.out.println(map.keySet());
        Collection<String>value=map.values();
        //returns collection cause value can be duplicated or can say same as set does not allow duplicates so Collection
        System.out.println(value);
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        System.out.println(entries);
        //entrySet returns both key value pairs of a map not one
        // it returns a set with the above generics Entry is an interface present in Map interface
        System.out.println("********");
        map.replace(101,"rite");
        System.out.println(map);
        //replace replaces the element with value if present or not
//        System.out.println(map.re);
//        System.out.println(map.get("rite"));
        System.out.println(map.get(101));
        // get asks for key and returns the values present inside a key
        System.out.println(map.get(299));
        System.out.println(map.getOrDefault(100,"unsuccessful"));
        //get or default enhanced version of get returns null if key is not present returns the provided default string provided
        //both put if absent and get or default are used in production
        Set<Map.Entry<Integer,String >> entrySet=map.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet)
        {
            Integer i= entry.getKey();
            String s=entry.getValue();
            System.out.println("key is"+i+" value is "+s);
        }
        //we can iterate through the entry set with a specific entry element
        Map<Integer,String> map2=Map.of(1,"lankesh",2,"rahul",3,"kunal");
//        map2.put(102,"naa");
        //similar as list of it is immutable we cannot perform operations on it
        Map<Integer,String> map3=Map.copyOf(map2);
        // similar copy of as list immutable



    }
}
