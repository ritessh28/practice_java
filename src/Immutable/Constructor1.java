package Immutable;

public class Constructor1 {
}
class Animal
{
    private Animal()
    {
        System.out.println("no arg private");
    }
    public Animal(int i)
    {

    }
}
class Dog extends Animal
{
    Dog()
    {
        super(10);
    }
}