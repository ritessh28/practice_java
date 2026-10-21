package Java8.FunctionComposition;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> blank = String::isBlank;
        System.out.println(empty.test("eje"));
//        Predicate<String>ans=()->
        Predicate<String>ans=blank.or(empty);
        System.out.println(ans.test("   "));


    }
}
//in this example we are checking if a string is empty and blank empty meaning no content but spaces are valid here they treat
//space as string but in blank space is not considered only letters so if string has space also it returns false
//we are creating two predicate reference and passing lambda and finally is the third we are combining bith