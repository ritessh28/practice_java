package concurrentCollections;

import java.util.concurrent.ConcurrentHashMap;

public class CHashMapMethods {
    static void main(String[] args) {
        ConcurrentHashMap<Integer,String>map=new ConcurrentHashMap<>();
        map.put(101,"ritesh");
        map.put(102,"rahul");
        //CHM remove method checks if both key and value matches if yes then remove and return true otherwise only if
        //key matches return false
        System.out.println(map.remove(101,"ramesh"));
        System.out.println(map.remove(101,"ritesh"));
        System.out.println(map);

        //putIfAbsent checks if the key is associated with some value if yes does not replace the value if key does not
        //exist then create an entry with specified key and value
        System.out.println(map.putIfAbsent(102,"ritesh"));
        System.out.println(map.putIfAbsent(101,"rakesh"));
        System.out.println(map);

        //cannot add null key and values
//        map.put(null,"ram");

        //similar as remove if both key and value match then only replace otherwise return false
        System.out.println(map.replace(101,"ritesh","rohit"));

    }
}
