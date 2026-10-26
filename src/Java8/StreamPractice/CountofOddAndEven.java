package Java8.StreamPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountofOddAndEven {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 8, 2, 9, 1, 8);
        Map<Boolean,Long>ans=nums.stream()
                .collect(Collectors.partitioningBy(n->n%2==0,Collectors.counting()));
        System.out.println(ans);

    }
}
