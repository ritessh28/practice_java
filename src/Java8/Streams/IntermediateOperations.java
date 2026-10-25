package Java8.Streams;

import java.util.*;
import java.util.stream.*;

public class IntermediateOperations {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(10,30,60,90,100,30,60));
        Stream<Integer> stream=list.stream();//one way of creating stream
        list.stream().map(s-> s)//another way of creating stream and directly performing operations
                .filter(s->s>10)
                .sorted()
                .distinct()
                .limit(4)
                .skip(2)
                .forEach(System.out::println);
        System.out.println("****************");
//        List<List<Integer>>list2=new ArrayList<>();
//        list2.add(List.of(10,20,30));
//        list2.add(new ArrayList<>(List.of(50,60)));
//        list2.stream().flatMap(s->s.stream())
//                .map(s->s+2)
//                .forEach(System.out::println);
    }
}
//map:takes Function<T,R> T as an argument and returns R  <T,R> can be different-stateless
//filter:takes Predicate<T,boolean> takes T as an argument perform operations or checks condition and based on that
//return boolean either true or false-stateless
//sorted has two overload version one with no parameter that sorts in ascending order and one which takes comparator
//as an argument for sorting in descending order -stateful cause after gathering every element it performs sort operation
//flatMap:treats every object as an element
/*definition for flatMap
Definition: flatMap is a Stream (and Optional) operation that applies a function to each element, where the function
returns a stream, and then flattens all those streams into a single stream.*/
//distinct:removes duplicate element and keep  only independent element one value per object
//limit: applies a limit to iterate and generate stop condition
//skip:skips the no of elements we provide
