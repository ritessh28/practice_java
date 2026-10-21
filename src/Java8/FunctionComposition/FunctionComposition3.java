package Java8.FunctionComposition;

import java.util.function.Function;

public class FunctionComposition3 {
    public static void main(String[] args) {
        Function<String,String> trim=String::trim;
        Function<String,String> lower=String::toLowerCase;
        Function<String,String> upper=String::toUpperCase;
        Function<String,String>ans=trim.andThen(lower);
        System.out.println(ans.apply("   helloo   "));
    }
}
