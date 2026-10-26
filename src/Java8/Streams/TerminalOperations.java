package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class TerminalOperations {
    public static void main(String[] args) {
            List<Integer> list=new ArrayList<>(List.of(10,12,22,33,48,90,13,10));
//            list.stream().forEach(System.out::println);
//            List<Integer>l2=list.stream()
//                    .filter(s->s>10)
//                    .map(n->n*2)
//                     .toList();
//           l2.add(90);
//            System.out.println(l2);
//            Set<Integer> set=list.stream()
//                    .collect(Collectors.toSet());
////
//             System.out.println(set);

//           Optional<Integer>op= list.stream()
////                    .findFirst();
////
////
//        System.out.println(op);
        Optional<Integer>op1= list.stream()
                .findAny();
//
//
//        System.out.println(op);
        Long res=list.stream().filter(n->n>10)
                .count();
        System.out.println(res);
        boolean result=list.stream().anyMatch(s->s%2==0);
        System.out.println(result);
        boolean ans=list.stream().allMatch(s->s%2==0);
        System.out.println(ans);
        boolean ans2=list.stream().noneMatch(s->s%2==0);
        System.out.println(ans);


        Optional<Integer> cp=list.stream()
                .filter(n->n>20)
                .max((a,b)->a-b);
        System.out.println(cp);


        OptionalDouble max=list.stream()
                .filter(n->n>20)
                .mapToInt(x->x)
                .average();


        List<String> str=new ArrayList<>(List.of("a","bb","ccc","dddd"));
        System.out.println(max.getAsDouble());


            System.out.println("*********");
        Map<Integer,String> map=str.stream()
                .collect(Collectors.toMap((s->s.length()),(s->s)));
        System.out.println(map);


        List<String>s1=new ArrayList<>(List.of("AAA","BB","CCC","DD"));
        Map<Integer,List<String>> mp=s1.stream()
                .collect(Collectors.groupingBy(s->s.length()));
        System.out.println(mp);


        Map<Boolean,List<Integer>> b=list.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(b);
        System.out.println(list.stream()
                .collect(Collectors.partitioningBy(s->s%2==0,Collectors.counting())));



        Map<Integer,List<String>> map1=s1.stream()
                .collect(Collectors.groupingBy(s->s.length(),
                        Collectors.mapping(s->s.toLowerCase(),Collectors.toList())));
        System.out.println(map1);


        List<String> str1=new ArrayList<>(List.of("java","rite"));
            String n1=(str1.stream().collect(Collectors.joining("-")));
            System.out.println(n1);


        String n3=str1.stream().collect(Collectors.joining("-","[","]"));
            System.out.println(n3);
//            String h1="java".toLowerCase()
    }
}
//forEach: takes a Consumer<T> and iterate for each element in the list and perform operation mostly printing
//toList:returns a immutable list of specific type cannot modfify the existing content or add new content/elements
//collect(takes Collector type  as an argument ): collector is an interface with method declaration
//Collectors is a class which has this method it does not implement any interface
//such as toSet(). toList()
//main difference between toList and collect() is toList returns a immutable list and collect returns a mutable list/any
//other collection
//findFirst()short circuiting:returns a optional object of a specific type and terminates the stream other statements are ignored after that
//findAny():similar as findFirst()
//count returns count of values/elements after performing filtering or various operations similar as above it terminates as
//it returns a long value we cannot perform further operation on it
//anyMatch :takes predicate as an argument and returns either boolean true or false if the condition is satisfied by any one
//of the element in a collection/subTypes
//allMatch:similar as anyMatch but checks if every element satisfies the condition
//noneMatch:opposite of allMatch
//function such as sum max min avg are applicable only to integer type not wrapper object
//function to convert wrapper to primitive mapToInt mapToDouble mapToLong
//some of this return optionalInt class
//toMap function of Collector class accept two FUNCTION arguments one for key operation which key  to add
//and one for value type
//groupingBy is a function of Collectors class which takes a function as an argument returns a map with the type we provide as
//key and creates a list<> which matches the key. for every key it creates a new list with the values as list
//in the above example we have provided function on what basis key needs to be evaluated that is based on the length of string
//if length is 2 add key as 2 and in values ie of type list add the values in list which matches the key.
//partitioning is also a method of Collectors class which take predicate as an argument and returns a map with key as boolean
//type ie true/false and list of values which satisfies the condition are present in true and which do not satisfy in false
//Map<K, List<T>>
//counting is a down stream method of collectors class which returns a long value count of true and count of false
//return boolean as key and count of boolean true/false as value
//mapping is a  overload part of groupingBy function groupingBy is used for groupingBy key if we use Collectors.mapping
//it is for value type it takes two arguments one for what will the value be as function and another as mapping to
//list set or anything
//joining has three overload methods all methods returns a concatenated single string
//1.with no parameter
//2.with one parameter as delimeter()
//3.with three parameter delimiter suffix prefix
//by default collectors class methods groupingBy and partitioningBy  returns a <List>