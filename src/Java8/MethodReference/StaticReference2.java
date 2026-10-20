package Java8.MethodReference;

import java.util.function.*;

public class StaticReference2 {
    public static void main(String[] args) {
        Consumer<String> print=System.out::println;
        print.accept("ritesh shetty");
        print.accept("hello world");
        Consumer<String>details=Person::printDetail;
        details.accept("employee");
        BiConsumer<String,Integer> multiDetails=Person::printDetails;
        multiDetails.accept("ritesh",21);
    }
}
class Person
{
    public static void printDetail(String name)
    {
        System.out.println("name is "+name);
    }

    public static void printDetails(String name, Integer age) {
        System.out.println("name is "+name+"and age is :"+age);

    }
}
//we are using system class here in which out is a static object, and we have println method in that
//in person class we are creating static method named detail
//we are using consumer interface reference type cause we are passing one argument and not returning anything so
//in details method we are accepting two arguments name and age and printing it
//we are storing it im BiConsumer cause we want to just accept argument and print it not return anything
