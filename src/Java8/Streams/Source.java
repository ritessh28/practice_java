package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Source {
    public static void main(String[] args) {
        int []arr=new int[]{10,20,31,40,55,80};
        IntStream stream=Arrays.stream(arr);
        stream.filter(s->s%2==0)
                .map(s->s*2)
                .forEach(System.out::println);
        List<Integer> li=Arrays.asList(10,20,30);
//        li.add(40);
        System.out.println(li);
        li.set(1,90);
        System.out.println(li);
        var a=(List.of(20,30,80));
//        a.add(900);
        System.out.println(a);
        Stream<Integer>s1=Stream.of(2,3,4,5);
        Stream.of(10,20,30,40).map(s->s+10)
                .filter(s->s%2!=0).
                forEach(System.out::println);

    }
}
