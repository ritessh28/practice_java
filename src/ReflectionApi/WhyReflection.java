package ReflectionApi;

public class WhyReflection {
    public static void main(String[] args) {
//        System.out.println(Demo.m);
//        Demo d=new Demo();
        Demo.staticMethod();
    }

}
class Demo
{
    static
    {
        System.out.println("inside static block");
    }
    {
        System.out.println("inside instance block");
    }
    public Demo()
    {
        System.out.println("inside constructor");
    }
    public static void staticMethod()
    {
        System.out.println("Inside static method");
    }
}
//so the execution order is first
//static block gets executed if its present and static block gets executed once only when the class is loaded for the
//first time if it's not loaded it does not get executed it executes before any method constructor or instance block
//then the instance block gets executed when the object is created or memory is allocated to the object in heap
//instance block gets executed everytime a new object gets create if we created two objects it gets executed for
//2 time and so on
//and then the constructor gets executed if one present or default constructor
//after that bases on the explicit method call which we provide method gets executed it does not get called automatically
//suppose if we don't want to create a object of a class only load it and know the constructors methods subclasses
//everything we use reflection