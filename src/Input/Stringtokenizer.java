package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stringtokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of array:");
        int n=Integer.parseInt(br.readLine());
        int []arr=new int[n];
        System.out.printf("enter %d elements in array separated by space:\n",n);
        StringTokenizer st=new StringTokenizer(br.readLine());
        int i=0,sum=0;
        while(st.hasMoreTokens())
        {
            arr[i]=Integer.parseInt(st.nextToken());
            sum=sum+arr[i];
            i++;
        }
        for(int j=0;j<n;j++)
        {
            arr[j]=Integer.parseInt(st.nextToken());
        }
        System.out.println("sum is ="+sum);
        // cause nosuchelementException if length is more and
        // user adds less values
        // suppose length=5 and user enter 10 20 30
        /*Exception in thread "main" java.util.NoSuchElementException
        at java.base/java.util.StringTokenizer.nextToken(StringTokenizer.java:349)
        at Input.Stringtokenizer.main(Stringtokenizer.java:25)*/

    }
}
