package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(5, 12, 9, 3, 4,10));
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(3,10));
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for(int i=0;i< al.size();i++)
        {
            if(al.get(i)>large)
            {
                secondLarge=large;
                large=al.get(i);
            }
            else if(al.get(i)>secondLarge)
            {
                secondLarge= al.get(i);
            }
        }
        System.out.println(large);
        System.out.println(secondLarge);
    }
}
