package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;

public class Br1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a string");
        String str=br.readLine();
        System.out.println(str);
        System.out.println("enter a interger value:");
        int n=Integer.parseInt(br.readLine());
        System.out.println(n);
        System.out.println(n+n);
        br.close();

    }
}
