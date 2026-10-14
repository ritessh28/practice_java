package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {
        ArrayList <Integer>al=new ArrayList<Integer>(Arrays.asList(5,12,9,12,3,12));
        System.out.println(findCount(al));


    }
    public static int findCount(ArrayList<Integer> ae)
    {
        int cnt=0;
        for(int i=0;i<ae.size();i++)
        {
            if(ae.get(i).equals(12))
            {
                cnt++;
            }
        }
        return cnt;

    }
}
