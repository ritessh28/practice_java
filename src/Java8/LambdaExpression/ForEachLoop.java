package Java8.LambdaExpression;
import java.util.*;
import java.util.function.Consumer;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(10,20,30,40,50,60));
//        list.add(12);?
        list.forEach((s)-> System.out.println(s+" "));
        Consumer<Integer>printList=((s)-> System.out.println(s));
        list.forEach(printList);

    }
}
//forEachLoop is a default method of iterable interface
//which accepts consumer type interface method implementation
//so above we have directly passed the implementation of the consumer interface accept method
//or we can pass reference of consumer interface