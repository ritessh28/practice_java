package Generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardNeed2 {
    public static void main(String[] args) {
        List <Parent> p1=new ArrayList<>();
        p1.add(new Parent());
        p1.add(new Parent());
        p1.add(new Child());
        parentList(p1);
        List <Child> c1=new ArrayList<>();
        c1.add(new Child());
        c1.add(new Child());
//        c1.add(new Parent());
//        parentList(c1);
        // parent reference cannot accept child object in generics but in concrete class its allowed

    }
    public static void parentList(List<Parent> parents)
    {
        for(Parent p:parents)
        {
            p.walk();
        }
    }
}
class Parent
{
    public void walk()
    {
        System.out.println("walking");
    }
}
class Child extends Parent
{
    @Override
    public void walk()
    {
        System.out.println("walking(child)");
    }

}