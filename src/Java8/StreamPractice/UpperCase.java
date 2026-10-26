package Java8.StreamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 8, 2, 9, 1, 8);
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        List<String>upperCase=words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCase);
        List<String>wordsByLength=words.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
        System.out.println(wordsByLength);



    }
}
//so Comparator is a functional interface with compare method and comparing is a static method of comparator interface
//which has implemented compare logic in functional way lambda so it returns a lambda expression which will work as
//implementation for Comparator interface then comparing is also similar it same as when we want to compare based on
//multiple fields if length is same then on the basis of alphabets so if comparing returns 0 then the other thenComparing
//will be used for same length
