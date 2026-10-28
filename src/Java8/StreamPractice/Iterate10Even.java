package Java8.StreamPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterate10Even {
    public static void main(String[] args) {
        Stream.iterate(2,s->s+1)
                .filter(s->s%2==0)
                .limit(10)
                .forEach((s)-> System.out.println(s));
        Stream.iterate(2,s->s+2)
                .limit(10)
                .forEach(System.out::println);
    }
}
