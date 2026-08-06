package ExceptionHandling;

import java.util.Scanner;

public class Exception8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        int n;
        try
        {
            System.out.println("enter the value for index");
            n= sc.nextInt();
            arr[n]=21;
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Inside first catch block");
            try
            {
                System.out.println("try again");
                System.out.println("enter the value for index");
                n= sc.nextInt();
                arr[n]=79;

            }
            catch(IndexOutOfBoundsException e2)
            {
                System.out.println("Inside second catch block");
                System.out.println(e2.getMessage());
            }
            finally
            {
                System.out.println("Finally block execeuted");
            }
        }
    }
}
