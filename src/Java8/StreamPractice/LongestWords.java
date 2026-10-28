package Java8.StreamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWords {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        Optional<String>ans=words.stream()
                .max(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println(ans.orElse("none"));

    }
}
