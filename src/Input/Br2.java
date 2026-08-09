package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Br2 {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Enter first number");
            int n1= Integer.parseInt(br.readLine());
            System.out.println("Enter second number");
            int n2=Integer.parseInt(br.readLine());
            int c=n1+n2;
            System.out.println("addition is ="+c);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
