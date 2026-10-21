package Java8.FunctionComposition;

import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<Integer>greater=Calculator::greaterThan;
        Predicate<Integer>zero=Calculator::equalToZero;
        Predicate<Integer> ans=greater.or(zero);
        System.out.println(ans.test(12));
    }
}
class Calculator
{
    public static boolean greaterThan(Integer a)
    {
        return a>10;
    }
    public static boolean equalToZero(Integer a)
    {
        return a==0;
    }
}