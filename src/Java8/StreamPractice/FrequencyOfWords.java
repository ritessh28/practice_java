package Java8.StreamPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWords {
    static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        Map<String,Long>map;
        map=words.stream()
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(map);

    }
}
