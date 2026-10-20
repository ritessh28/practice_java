package CollectionFramework.PracticePrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(List.of(2,3,4,5,6,2,3,4,6)));


    }
    public static List<Integer> removeDuplicates(List<Integer> list)
    {
        List<Integer>newlist=new ArrayList<>();
        Set<Integer>s1=new HashSet<>();
        for(int i=0;i<list.size();i++)
        {
            if(!newlist.contains(list.get(i)))
                newlist.add(list.get(i));

        }
        return newlist;
    }
    public static List<Integer> removeDuplicate(List<Integer> list)
    {
        List<Integer>newlist=new ArrayList<>();
        Set<Integer>s1=new HashSet<>();
        for(Integer i:list)
        {
            if(s1.add(i))
                newlist.add(i);
        }
        return newlist;
    }
}
//use the second approach if the list is of suppose of 1 million elements
//because while adding it adds based on hashcode if we are adding a previously added element it returns false
//so if it returns true we add of false we expect its already added so we wont duplicate it
//the first approach is useful for small list but for more elements the contains method need to iterate overe the entire
//list to find if its present or not which is costly and makes is 0(n)2