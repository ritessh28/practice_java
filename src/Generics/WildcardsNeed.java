package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsNeed {
    public static void main(String[] args) {
        Animal1 al=new Cat();
        // creating child object with parent reference is
        // allowed within single class and even in arrays
//        al.eat();
//        al=new Animal1();
//        al.eat();
        Cat c=(Cat)al;
        c.speak();
        Animal1 []animal=new Animal1[5];
        Animal1 []cats=new Cat[5];
//        cats[1]=new Animal1();
        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.toString(animal));
        // we can have arr of animal reference which point to array of dog object
        // example we can have arr of parent reference which point to array of child object
        // in our example animal(parent) and cat(child)
        // cats[1]=new Animal1()
        // but if we add parent reference in one of the indexes of child array it will accept
        // but while printing arraystore excp will be thrown
        // it will throw ArrayStore exception
        // so its better not to declare it like this
        List<Cat>cat=new ArrayList<>(Arrays.asList(new Cat()));
        System.out.println(cat.size());
        List<Animal1>anml1=new ArrayList<>();
//        anml1=cat;
        // we cannot do the above steps for generics as we did for normal class and with array
        // parent class reference child class object





    }
}
class Animal1
{
    public void eat()
    {
        System.out.println("animal eating");
    }


}
class Cat extends Animal1
{
    @Override
    public void eat()
    {
        System.out.println("cat eating");
    }
    public void speak()
    {
        System.out.println("meow");
    }
}