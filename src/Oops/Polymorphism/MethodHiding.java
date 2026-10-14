package Oops.Polymorphism;
class Animal1
{
    public static void speak(Animal1 obj)
    {
        System.out.println("animal implementation");
//        Animal1 obj=new Animal1();
//        obj.m1();
        obj.m1();
    }
    private void m1()
    {
        System.out.println("animal implementation");

    }

}
class Dog1 extends Animal1
{
    public static void speak()
    {
        System.out.println("dog implementation");
    }
}
class Cat1 extends Animal1
{
    public static void speak()
    {
        System.out.println("cat implementation");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
//        Cat1 cat=new Dog1();
        Animal1 cat=new Cat1();
        cat.speak(cat);
        Dog1 d=new Dog1();
        d.speak();
        cat =new Dog1();
        cat.speak(cat);
//        Cat1.speak();
        Animal1 a1=new Animal1();
        a1.speak(a1);





    }

}
