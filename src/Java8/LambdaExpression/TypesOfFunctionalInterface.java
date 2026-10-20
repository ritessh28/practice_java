package Java8.LambdaExpression;
import java.util.function.*;
public class TypesOfFunctionalInterface {
    public static void main(String[] args) {
        //function interface
        //apply function takes <T> as argument and returns <R>
        //notice that <T> and <R> can be different
        //use case:to return square of a number
        //to return if a no is even or odd
        Function<Integer, Integer> function = (a) -> a + a;
        System.out.println("square using function 10 : " + function.apply(10));
        Function<Integer, Boolean> isEven = (a) -> a % 2 == 0;
        System.out.println("checking odd or even using function: 11 " + isEven.apply(11));
        System.out.println("checking odd or even using function: 20 " + isEven.apply(20));

        //consumer interface
        //accept function only takes one input of type <T> and does not return anything as the name suggest consumer only consumes
        //use case to print a value or even square of a number but it does not return we should directly print in implementation
        Consumer<Integer>printSqaure=(a)-> System.out.println("square of " +a+" is: " +a*a);
        printSqaure.accept(10);
        Consumer<String>printName=(s)-> System.out.println("name is"+s);

        //Supplier Interface
        //opposite of consumer
        //get function does not take any input just return something of type<T> we provide
        Supplier<String> getClgName=()->"gogte clg";
        System.out.println(getClgName.get());

        //predicate interface
        //test method
        //takes <T> as an argument and returns boolean true or false as return type
        //useful when we want return type as boolean
        Predicate<Integer>numberPositiveNegative=(a)->
        {
            if(a>0)
                return true;
            return false;
        };
        System.out.println(numberPositiveNegative.test(-90));
    }
}