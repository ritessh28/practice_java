package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer>li=new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7));
        int j=li.size()-1,i=0;
        while(i<j)
        {
            int temp=li.get(i);
            li.set(i,li.get(j));
            li.set(j,temp);
            i++;
            j--;
        }
        System.out.println(li);
    }
}
