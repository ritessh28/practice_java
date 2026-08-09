package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Split {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of array:");
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[n];
        System.out.printf("enter %d elements in array separated by space:\n",n);
        String []str=(br.readLine().split(" "));
        System.out.println(Arrays.toString(str));
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            sum=sum+arr[i];
        }
        System.out.println(Arrays.toString(str));
        System.out.println("sum is "+sum);


    }
}
