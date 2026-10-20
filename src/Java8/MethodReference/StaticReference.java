package Java8.MethodReference;

import java.util.function.IntBinaryOperator;

class Calculator
{
    public static int add(int a,int b )
    {
        return a+b;
    }
    public static int multiply(int a,int b)
    {
        return a*b;
    }
}
public class StaticReference {
    public static void main(String[] args) {
        IntBinaryOperator addition=Calculator::add;
        System.out.println("Addition: "+addition.applyAsInt(2,4));
        IntBinaryOperator mul=Calculator::multiply;
        System.out.println("Multiplication: "+mul.applyAsInt(10,20));
    }
}
//static as method reference
//syntax classname::staticMethodName
//we are storing it in Int binary Operator type cause it takes two int as an argument and even returns int value
//method reference type is an enhanced version of lambda expression
//in static we don't need to object to call static method
//as it can be called through classname