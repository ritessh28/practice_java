package Array;

import java.util.Arrays;

public class MoveZeroesStart {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 4, 0, 5, 8, 0};
        int i=arr.length-1;
        int j=arr.length-1;
        while(i>=0)
        {
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            i--;
        }
        System.out.println(Arrays.toString(arr));

    }
}


