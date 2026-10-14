package Generics;
public class WhyGenerics {
    public static void main(String[] args) {
        Object obj="hello";
        String s=(String)obj;
        // changing generics(Object) to specific type string also known as downcasting
        // issue with this approach is that at the run time if we pass another object
        // should be explicitly downcasted toa specific type
        // suppose we are supposed to provide string but at run time integer is provided
        // it will generate class cast exception
        //example
//        Object obj1=10;
//        String s1=(String) obj1;

        Integer i=10;
        Object o2=i;
        // changing specific(String,Integer) type to generic type(Object) known as upcasting
        // should not be explicitly upcasted because every string is a object but not every object is a string
        // or every user defined class or Integer class is a object
        // but an object can be anything it can be String wrapper class user defined etc
        // it cannot hold a specific value
        // so to change to specific casting explicit casting is required
        // because a string can hold string value and an integer can store integer only
        System.out.println(o2);
        Object obj2=new String("java");
        System.out.println(obj2);
//        String s2=(String) new Object();

    }
}
