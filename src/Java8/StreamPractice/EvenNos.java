package Java8.StreamPractice;

import java.util.*;

public class EvenNos {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 8, 2, 9, 1, 8);
        nums.stream()
                .filter(s->s%2==0)
                .distinct()
                .forEach(System.out::println);
    }
}
