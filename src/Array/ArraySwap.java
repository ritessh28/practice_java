package Array;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int []arr={2,90,100,1};
        for(int i=0;i<arr.length-1;i++)
        {
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}

