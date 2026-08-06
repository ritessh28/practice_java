package Oops.Abstract;
abstract class Animal {
    void  eat()
    {
        System.out.println("all animals eat food");

    }
    void sleep()
    {
        System.out.println("animals sleep");
    }
    abstract void sound();
}
class Dog extends Animal {
    public void sound()
    {
        System.out.println("dog barks");
    }
    void eat()
    {
        System.out.println("dog eating");
    }
}
class Cat extends Animal {
    public void sound()
    {
        System.out.println("cat meows");
    }
}

public class Abstraction1 {
    public static void main(String[]args)
    {
        Cat c=new Cat();
        c.eat();
        c.sleep();
        c.sound();
        Dog d=new Dog();
        d.sound();
    }

}
