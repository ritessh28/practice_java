package CollectionFramework.PracticePrograms;
import java.util.*;
public class GroupWordsByLength {
    static Map<Integer, List<String>> groupByLength(List<String> words) {
        Map<Integer,List<String>> map=new TreeMap<>();
        for(String s:words)
        {
            System.out.println(s.length());
            List<String>list=map.getOrDefault(s.length(),new ArrayList<>());
            list.add(s);
            map.put(s.length(),list);
        }
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        List<String>s1=new ArrayList<>(List.of("apple", "fig", "kiwi", "pear", "plum", "banana"));
        s1.add("ramu");
        groupByLength(s1);
//        String s="apple fig kiwi, "pear", "plum", "banana"
    }
}
