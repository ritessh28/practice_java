package Java8.StreamPractice;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Squares {
    static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 8, 2, 9, 1, 8);
        nums.stream()
                .map(s->s*2)
                .distinct()
                .forEach(System.out::println);
        int sum=nums.stream()
                .mapToInt(s->s)
                .sum();
        System.out.println(sum);
        IntSummaryStatistics res=nums.stream()
                .mapToInt(s->s)
                .summaryStatistics();
        System.out.println(res.getSum());
        System.out.println(res.getAverage());
    }
}
//IntSummaryStatics is a class and .summaryStatistics is a terminal operation which return a object of summaryStatistics type
//which contains multiple methods such as sum avg max min etc