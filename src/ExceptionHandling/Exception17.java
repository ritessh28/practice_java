package ExceptionHandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Calculator
{

    private int a,b;
    public Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int  add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
    public int mul()
    {
        return a*b;
    }
    public int div() throws ArithmeticException
    {
//        PrintWriter out = new PrintWriter("abc.txt");
//        out.println("ok");
//        return a/b;
        return a/0;
    }
}
public class Exception17 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ay two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calculator c=new Calculator(a,b);
        int ch;
        System.out.print("Calculator\n1.Addition" +
                "\n2.Subtraction"+
                "\n3.Multiplication"+
                "\n4.Division\n");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Addition:"+c.add());;
                break;
            case 2:
                System.out.println("subtraction:"+c.sub());
                break;
            case 3:
                System.out.println("multiplication:"+c.mul());
                break;
            case 4:
                System.out.println("Division:"+c.div());
                break;
        }
    }
}
