package TestPractice;

import java.util.Arrays;

public class EvenOdd {
    static void main(String[] args) {
        int []arr={12,13,15,19};
        int res=0;
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(i%2==0&&j%2!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
