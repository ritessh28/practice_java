package Oops.Polymorphism;
class Parent1
{
    static void display()
    {
        System.out.println("display method of parent1 class");
    }
}
class Child1 extends Parent1
{
    static void display()
    {
        System.out.println("display method of Child1 class");
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        Parent1 p1=new Child1();
        // even though object is created of class Child as the method is static
        //it calls parent method display because static method are compile time methods,
        // and it does not follow runtime polymorphism
        p1.display();//calls display method of class parent because refernce is of type Parent
        Child1.display();
        Child1 c=new Child1();
        c.display();
    }

}
