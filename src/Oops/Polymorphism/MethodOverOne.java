package Oops.Polymorphism;
class Animal
{
    int value=10;
    public void sound()
    {
        System.out.println("animal making sound");
    }
}
class Dog extends Animal
{
    int value=20;
    public void sound()
    {
        System.out.println("barking");
    }
}
public class MethodOverOne {
    public static void main(String[] args) {
        Animal obj=new Dog();
        //call sound method of dog because at run time the object of type Dog() is created
        obj.sound();
        System.out.println(obj.value);
        // prints value of class animal because class fields and static
        //method don't follow runtime memory mechanism based on object the value or method ie static is
        //based on compile time ie reference variable not the object
        System.out.println(((Dog)obj).value);
    }

}
