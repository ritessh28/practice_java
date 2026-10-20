package Java8.MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Supplier;

public class ArbitraryReference {
    public static void main(String[] args) {
       Function<String,String> lower=String::toLowerCase;
        System.out.println(lower.apply("ritesh"));
        Function<String,Integer>length=String::length;
        System.out.println(length.apply("alka"));
        List<String>list=new ArrayList<>(Arrays.asList("ramesh","aditya","bhushan"));
//        list.sort((a,b)->a.compareToIgnoreCase(b));
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }
}
//syntax for arbitrary reference
//classname::instanceMethod
//it treats first argument as its object for example in our example we have used
//function interface cause it takes one argument of specified and return argument of specified type
//so we have passed string in generic first as toLowercase is a method of string class so it treats string argument as
//object of string and lowercase returns string itself we are returning string
//className::instanceMethodName -> changes to
//objectName::instanceMethod
//in the list we are creating a list and calling sort method as it accepts a list and a comparator object as it is functional
//interface with compare method we can pass lambda expression and method reference
//so we have used string which will be treated as string object and compareToIgnoreCase is a method of string it runs