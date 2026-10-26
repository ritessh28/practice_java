package Java8.StreamPractice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LinkedFrequencyWords {
    public static void main(String[] args) {
            List<String> words = List.of("java", "stream", "lambda", "api", "map", "java");
        LinkedHashMap<String,Long> linkedMap;
        linkedMap=words
                .stream()
                .collect(Collectors.groupingBy((s->s),LinkedHashMap::new,Collectors.counting()));
        System.out.println(linkedMap);
        TreeMap<String,Long> treeMap=
                words.stream()
                        .collect(Collectors.groupingBy((s->s),TreeMap::new,Collectors.counting()));
        System.out.println(treeMap);
        TreeMap<String,Long> treeMap2=
                words.stream()
                        .collect(Collectors.groupingBy((s->s),()->new TreeMap<>(),Collectors.counting()));
        System.out.println(treeMap);
    }
}
