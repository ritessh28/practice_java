package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        List<Boolean> br=new ArrayList<>();
        int[] candies=new int[]{2,3,5,1,3};
        int extraCandies=3;
        int max=0;
        for(int i:candies)
        {
            max=Math.max(i,max);
            System.out.println(max);
        }
        for(int j=0;j<candies.length;j++)
        {
            if(candies[j]+extraCandies>=max)
            {
                    br.add(true);
            }
            else
            {
                br.add(false);
            }
        }
        for(boolean b:br)
        {
            System.out.print(b+"");
        }
    }

}
