package Java8.FunctionComposition;

import java.util.function.*;

public class FunctionComposition1 {
    public static void main(String[] args) {
        Function<Integer,Integer>one=(n)->n+2;
        Function<Integer,Integer>two=(n)->n*3;
        Function<Integer,Integer>three=(n)->n/2;
        Integer ans= three.apply(two.apply(one.apply(2)));
        System.out.println(ans);
        Function<Integer,Integer> res=one.andThen(two).andThen(three);
        System.out.println(res.apply(4));
        Function<Integer,Integer> res2=one.compose(two).compose(three);
        System.out.println(res2.apply(2));
    }
}
//use of function composition using function
//it is used to breakdown complex task into subtask and then combine with andThen or compose
//so basically andThen means do the provided task first left side then do the other thing right side
//and compose is the opposite of and then do the right side task first and then left side
//in the above program we have passed two lambdas first to two functional interface references which take Integer as
//argument and returns Integer itself first one add 2 and return it second one multiply it by 3 and third one divides
//it by 2 as we know the return type of whole expression is Integer we can directly store it in int and call the method
//of each as above for ans first the operations within the bracket will be calculated ie one.apply() and the result
//of one.apply will be treated as input for two.apply as right side will be calculated first  as one.apply is called
//by two.apply so two.apply accepts answer of one.apply as argument
//this to looks complicated to understand what is going on
//we can directly assign it to a function predicate reference which takes Integer as an argument and returns Integer
//andThen is used to apply from left to right and compose for vice versa
//and then returns function itself not a int value because at at last we are storing it in function predicate which
//accepts a function type where we pass lambda so end result should be function itself