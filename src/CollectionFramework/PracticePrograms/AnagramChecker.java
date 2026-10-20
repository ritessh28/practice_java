package CollectionFramework.PracticePrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(anagramChecker("listen","silent"));

    }
    static boolean anagramChecker(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character c:s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
//        System.out.println(map);
        for(Character c:s2.toCharArray())
        {
            if(!map.containsKey(c))
                return false;
            map.put(c,map.get(c)-1);
            if(map.get(c)!=0)
                return false;
        }
        System.out.println(map);
        return true;
    }
}
