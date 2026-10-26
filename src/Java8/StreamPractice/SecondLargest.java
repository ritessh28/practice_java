package Java8.StreamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 8, 2, 9, 1, 8);
       Optional<Integer> ans=nums.stream().
                distinct()
                .sorted(Comparator.reverseOrder())
               .skip(1)
               .findFirst();
        System.out.println(ans.get());

    }
}
