package Java8.StreamPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBywords {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        Map<Integer,List<String>>map=words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        Map<Integer,List<String>> map2=words.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.mapping(s->s.toUpperCase(),Collectors.toList())));

        System.out.println(map2);
    }
}
