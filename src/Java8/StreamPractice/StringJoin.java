package Java8.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;

public class StringJoin {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        System.out.println(words.stream().collect(Collectors.joining(", ","[","]")));

    }
}
