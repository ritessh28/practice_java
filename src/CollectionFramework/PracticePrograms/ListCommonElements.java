package CollectionFramework.PracticePrograms;
import java.util.*;

public class ListCommonElements {
    public static void main(String[] args) {
        Integer []arr={1};
        Integer []arr2={1,1};
        List<Integer>l1=new ArrayList<>(List.of(arr));
        List<Integer>l2=new ArrayList<>(List.of(arr2));
        System.out.println(commonElements(l1,l2));
    }
    static List<Integer> commonElements(List<Integer> l1,List<Integer> l2)
    {
        Set<Integer>newlist=new HashSet<>();
        Set<Integer> s1=new HashSet<>();
        s1.addAll(l1);
        for(Integer i:l2)
        {
            if(s1.contains(i))
            {
                newlist.add(i);
            }
//            System.out.println(s1.contains(i));
        }

        System.out.println(s1);
        return new ArrayList<>(newlist);

    }
}
