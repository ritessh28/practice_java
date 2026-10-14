package ExceptionHandling;

import java.util.Scanner;

public class Exception7 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            int n=sc.nextInt();
//
//            int []arr=new int[4];
//            arr[5]=1;
            try {
                System.out.println("Try again enter a new number");
                n=sc.nextInt();
                System.out.println(10 / n);
            }
            catch (ArithmeticException e) {
                System.out.println("inside Inner catch block");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("program terminated successfully");
            }
        }
        catch (RuntimeException e) {
            System.out.println("inside outer catch block");
            System.out.println(e.getMessage());
        }
    }
}
