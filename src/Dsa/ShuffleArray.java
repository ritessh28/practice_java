package Dsa;

import java.util.Arrays;
import java.util.*;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int []ans=new int[nums.length];
        int i=0,count=0;
        while(i<n)
        {
            ans[count]=nums[i];
            ans[count+1]=nums[n];
            count=count+2;
            n++;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr={2,5,1,3,4,7};
//        System.out.println(Arrays.toString(shuffle(arr, 3)));

        List<Integer> list = new ArrayList<>(List.of(10, 20, 30));
        list.remove(1);
        list.remove(Integer.valueOf(10));
        System.out.println(list);
    }
}
