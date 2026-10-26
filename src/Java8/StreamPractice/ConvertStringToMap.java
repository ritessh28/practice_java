package Java8.StreamPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertStringToMap {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        Map<String,Integer>map=words.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(),String::length));
        System.out.println(map);

    }
}
