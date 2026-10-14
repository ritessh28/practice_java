package Dsa;

import java.util.Arrays;

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
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
}
