package Java8.Streams;

import java.util.*;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>(List.of(10,20,30,40,50,99,300,401,509));
        Stream<Integer> stream=list.stream();
        stream=stream.filter(n->n>20);
        stream=stream.filter(s->s%2==0);
        stream=stream.map(s->s+2);
        stream.forEach(s-> System.out.println(s));
//        stream.forEach(System.out::println);


        list.stream()
                .filter(s->s>100)
                .filter(s->s%2!=0)
                .forEach(System.out::println);




    }
}
//two syntax for defining stream pipeline
//every intermediate operation returns a stream it should be stored in stream in first example
//terminal operation either return a value or void
//in the second syntax we are not storing anything so the result ie stream get appended to the next . till terminal condition
