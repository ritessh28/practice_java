package Array;

import java.util.Arrays;

public class MoveZeroesEnd {
    public static void main(String[] args) {
        int []arr={0,2,1,4,0,5,8,0};
//        int i=0,j=arr.length-1;;
//        for(int i=0;i<arr.length-1;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]==0&&arr[j]!=0)
//                {
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//
//            }
//        }
        int i=0,j=0;
        while(i<arr.length)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
        }
    }

