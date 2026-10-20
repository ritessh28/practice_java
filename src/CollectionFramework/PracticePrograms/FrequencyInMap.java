package CollectionFramework.PracticePrograms;

import java.util.*;

public class FrequencyInMap {
    static Map<String, Integer> wordFrequency(String sentence) {
        String []str=sentence.trim().toLowerCase().split("\\s+");
        System.out.println(Arrays.toString(str));
        Map<String,Integer>map=new HashMap<>();
        for(String s:str)
        {
            map.put(s, map.getOrDefault(s,0)+1);
//            System.out.println(map.get(s));
            map.values();
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(wordFrequency("ritesh is bad is ritesh"));
        System.out.println(wordFrequency("to be or not to be"));

    }
}
