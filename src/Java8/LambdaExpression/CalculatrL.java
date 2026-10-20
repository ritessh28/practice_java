package Java8.LambdaExpression;

public class CalculatrL {
    public static void main(String[] args) {
        Calculator c=(a,b)->a+b;
        System.out.println( c.calculate(2,4));
        print(10,20,c);
        print(20,30,(a,b)->a*b);


    }
    public static void print(int a,int b,Calculator c)
    {
        System.out.println(c.calculate(a,b));
    }
}
interface Calculator
{
    int calculate(int a,int b);
}
class Addition implements Calculator
{
    public int calculate(int a,int b)
    {
        return a+b;
    }

}