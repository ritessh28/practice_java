package Oops.Inherit;
interface Sound
{
    void sound();
}
interface Walking
{
    void walk();
}
class Animal  implements Sound,Walking
{
 public void sound()
 {
   System.out.println("All Animal make sound");
 }
 public void  walk()
 {
     System.out.println("All Animals walk");
 }
}
class Dog extends Animal  implements Walking,Sound
{
    public void sound()
    {
        System.out.println("Dog is barking");
    }
    public void walk()
    {
        System.out.println("Dog is Walking");
    }
}
class Cat extends Animal implements Walking,Sound
{
    public void  sound()
    {
        System.out.println("Cat is meowing");
    }
    public void walk()
    {
        System.out.println("Cat is Walking");
    }
}
public class Hybrid4 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.walk();
        Animal a=new Animal();
        a.sound();
    }
}
