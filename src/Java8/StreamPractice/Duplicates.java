package Java8.StreamPractice;

import java.util.List;

public class Duplicates {
    static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        System.out.println(words.stream().distinct().toList());
    }
}
