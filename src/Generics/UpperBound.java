
package Generics;

import pack1.AccesM;

public class UpperBound {
    public static void main(String[] args) {
//        Main<Animal> m1=new Main<>();
////        Main<Integer> m2=new Main();
//        m1.callEat(new Animal());
//        m1.callEat(new Fish());
        Main <Fish> f1=new Main<>();
        f1.callSwim(new Fish());
        f1.callEat(new Fish());
        ;



    }
}
interface Swimmable
{
    public void swim();
}
class Animal
{
    public void eat()
    {
        System.out.println("animal are eating");
    }

}
class Dog extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("Dog is eating");
    }
}
class Fish extends Animal implements Swimmable
{
    public void swim()
    {
        System.out.println("swimming");
    }
}
class Main<T extends Animal & Swimmable >
{
//    Object obj;
//    public Main(Object obj)
//    {
//        this.obj=obj;
//    }
    public void callEat(T ref)
    {
        ref.eat();
    }
    public void callSwim(Fish f)
    {
        f.swim();
    }
//    public void swim()
//    {
//        System.out.println("swimming");
//    }
    public void Play(T ref)
    {
        ref.eat();
        ref.swim();
    }
}