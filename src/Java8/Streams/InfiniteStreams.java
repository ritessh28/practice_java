package Java8.Streams;

import java.util.stream.Stream;

public class InfiniteStreams {
    public static void main(String[] args) {
        int n=1;
//        Stream.generate(()->"hello")
//                .limit(10)
//                .forEach(System.out::println);
        Stream.iterate(1,s->s+1)
                .limit(100)
                .skip(10)
                .forEach(System.out::println);
    }

}
//Stream.generate:takes a supplier<R> usually limited with limit operation
//Stream.iterate :takes a seed initial value and a Unary operator<T,T> the input type is only returned as a function part
//other values are not allowed
//limit: applies a limit to iterate and generate stop condition
//skip:skips the no of elements we provide
