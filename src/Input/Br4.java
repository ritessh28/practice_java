package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Br4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of array:");
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[n];
        System.out.printf("enter %d elements in array\n",n);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter string with space");
        StringTokenizer st=new StringTokenizer(br.readLine());
        while(st.hasMoreElements())
        {
            System.out.println(st.nextElement());
        }
    }
}
