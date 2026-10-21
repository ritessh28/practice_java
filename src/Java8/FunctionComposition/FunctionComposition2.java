package Java8.FunctionComposition;

import java.util.function.Function;

public class FunctionComposition2 {
    public static void main(String[] args) {
        Function<String,Integer> length=String::length;
        Function<String,String>upper=(s)->{
            System.out.println(s.toUpperCase());
            return s.toUpperCase();
        };
        Function<String,Integer>ans= upper.andThen(length);
        System.out.println(ans.apply("ritesh"));

    }
}
