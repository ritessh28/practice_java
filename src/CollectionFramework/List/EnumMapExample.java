package CollectionFramework.List;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.*;

public class EnumMapExample {
    public static void main(String[] args) {
        Map<Integer, String> s1 = new HashMap<>();
        Map<Direction, Integer> emap=new EnumMap<>(Direction.class);
        emap.put(Direction.EAST,1);
        System.out.println(emap);
        Map<Direction, Integer> emap2=new EnumMap<>(Map.of(Direction.NORTH,10,Direction.SOUTH,20));
        System.out.println(emap2);
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        for (int i = 1; i <= 0; i++)
//        {
//            al.set(i-1, i * i);
//        }
//        System.out.println(al);
        List<Integer> al = new ArrayList<Integer>(List.of(10,20,30,40,50));
        for (int i = 1; i <= 3; i++)
        {
//            al.set(i - 1, i * i);
            al.add(i * i);
        }

        System.out.println(al);
//        ArrayList<String> al2 = new ArrayList<String>;
        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

    }
}
enum Direction
{
    NORTH,SOUTH,EAST,WEST;
}