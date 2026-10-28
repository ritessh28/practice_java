package Java8.StreamPractice;

import java.util.List;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> nested = List.of(List.of(3, 1), List.of(4, 2), List.of(6, 5));
        System.out.println(nested.stream()
                .flatMap(s->s.stream())
                .sorted()
                .toList());
    }
}
