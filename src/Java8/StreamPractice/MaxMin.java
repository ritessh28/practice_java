package Java8.StreamPractice;

import java.util.IntSummaryStatistics;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 8, 2, 9, 1, 8);
        IntSummaryStatistics ans=nums.stream().mapToInt(s->s).summaryStatistics();
        System.out.println(ans.getMax()+"  " +ans.getMin());
    }
}
