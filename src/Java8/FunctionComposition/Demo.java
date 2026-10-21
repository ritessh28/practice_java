package Java8.FunctionComposition;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Predicate<String>startsWithUpper=(word)->word.startsWith("A");
        Predicate<String>endsWithLower=(word)->word.endsWith("x");
        Predicate<String>startsAEndsWithx=(word)->startsWithUpper.test(word)&&endsWithLower.test(word);
        Predicate<String> ans=startsWithUpper.and(endsWithLower);
        System.out.println(ans.test("Aryanx"));
        System.out.println(startsAEndsWithx.test("Arjux"));
        Predicate<String>result=startsWithUpper.or(endsWithLower);
        System.out.println(result.test("atharvax"));

    }
}
//functional composition are of two types:
//1.predicate functional composition using or and and
//2.functional composition using andThen and compose
//in this example we are using predicate we are creating two reference of predicate and passing the implementation there
//first check if first letter starts with 'A' if yes returns true otherwise false
//second check if last letter ends with 'x' true or false
//by using  predicate function composition we are checking with either Or or  and meaning we are breaking complex operation
//in a single task in the ans or result predicate we check if it starts with "A" and ends with 'x'
//by using our defined predicates
//or and works same as in operator as it returns boolean value

