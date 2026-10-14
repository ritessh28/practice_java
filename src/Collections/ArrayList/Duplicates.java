package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
//        ArrayList<Integer>al=new ArrayList<>(Arrays.asList(2,3,4,2,5,5,6,6,2,4));
        ArrayList<Integer>al=new ArrayList<>(Arrays.asList(2,2,2));
        for(int i=0;i< al.size();i++)
        {
            for(int j=i+1;j<al.size();j++)
            {
                if(al.get(i).equals(al.get(j)))
                {
                    al.remove(j);
                    j--;
                }
            }
        }
        System.out.println(al);
    }
}
