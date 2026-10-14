package Generics;

import java.util.ArrayList;
import java.util.List;

public class AchieveWildcards {
    public static void main(String[] args) {
        List<Parent1> p1=new ArrayList<>();
        p1.add(new Parent1());
        p1.add(new Child1());
        p1.add(new Parent1());
//        passAnyValue(p1);
        List<Integer>integer=new ArrayList<>();
        integer.add(4);
        integer.add(5);
        integer.add(6);
//        passAnyValue(integer);
        //through wild cards we can pass any value to the generics
        // wildcard is used when we want to break parent child relationship in generics
        // as through generics we can only pass any value
        // but if in a generics if its accepting only parent class we cannot pass child class object to it
        // it should not always be parent child relationship
        // we can even pass a completely different class like Integer above
        // the main purpose is to pass any object type
        // denoted by ? <?>
        // if we want to accept specific types only with the help of wildcard
        // we can combine it with upper bound which allows values of only specific type or its subclass
        // denoted by extends <?> extends Parent
        // here we can only pass parent class object list or its subclass type
//        passAnyValue(new L[1,3,4,5]);
        List<Child1> c1=new ArrayList<>();
        c1.add(new Child1());
        c1.add(new Child1());
        c1.add(new Child1());// c1 is child class so we can pass it
//        passParentAndChildValues(p1);
//        passParentAndChildValues(c1);
        List<Object> o1=new ArrayList<>();
        o1.add(new Object());
        //passParentAndChildValues(o1);
        // cannot pass object list because it is parent class of child not a subclass
        passBaseandParent(p1);
//        passBaseandParent(o1);
//        passBaseandParent(c1);

        List<Integer>l1=new ArrayList<>();
        List<Number>n1=new ArrayList<>();
        n1.add(20);
        passBaseandParentSuper(n1);


    }
    public static void passAnyValue(List<?> values)
    {
        Object obj=values;
        System.out.println(obj.getClass().getName());
        for(Object o:values) {
//            Parent1 p1=(Parent1)o;
//            ((Parent1) o).eat();
            System.out.println(o.getClass().getName());
        }

    }
    //known as upper bound can pass class and its covariant reading
    // with the help of extends with wildcards we can only read data as above
    //because the parameter can expect parent and its subclass in case of extends keyword
    //suppose if we are passing child class object in the parameter
    // and writing meaning adding parent class object in it  may cause class cast exception
    // so reading is only allowed in extends not writing
    public static void passParentAndChildValues(List<? extends Parent1> values )
    {
        for(Parent1 a:values)
        {
            a.eat();
        }
        Parent1 p=values.get(1);
        p.eat();
        System.out.println(p.getClass().getName());


//        values.add(new Parent1()); cannot perform adding/writing due to above reasons
    }
    //known as lower bound can pass provided class type and its super class not subtype (Writing) counter variant
    // using super with wildcards specify that the method can accept at least the class
    // which we have provided after super and can even accept super class of its class
    // in our example we can only pass Parent list and Object list not its subclass cause super is used
    // using super we can achieve adding object to the list of either the provided class or
    // its subtype in our example we can add parent object child objects in the list
    // because in function parameter we accept parent class or its super ie upper class not above
    // so super class of parent is object in our program and in case if its extending another class
    // in java by default every class extend object class
    // we cannot add object of object class in list
    // cause suppose we have passed list of parent class
    // and adding object of object class in the list it is not supported throws cc exception
    // basically we cannot read values through the class used after super
    // because we can even pass Object list in it
    // we can add any value in object list parent child anything
    // but a parent class list cannot hold Object item
    // a parent can hold it ie object can hold any value because it is parent to every class by default
    // so for reading only object class is used to hold value
    // and we cannot even call method of the class we have provided or its subclass methods
    // suppose we have added object class object in list it doesnt have the provided class or its sub class methods so
    // through extends we can add it because it accepts either parent or its subclass
    // and even if subclasses have not provided the method definition parent definitely provides implementation
    // we cannot read any other class except Object but if we want to call specific method of a class
    // suppose parent and its subclass have a method called something we can upcast it
    public static void passBaseandParent(List<?  super Parent1> values)
    {
//        for(Parent1 c:values)
//        {
//
//        }
          values.add(new Child1());
//          values.add(new Object());
//        values.add(new Integer());
//        values.add(new Object());
        Object ob=values.get(0);
        for(Object o:values)
        {
            Parent1 p1=(Parent1)o;
            p1.eat();
//            ((Parent1) o).eat();
            ((Parent1)o).eat();
            System.out.println(o.getClass().getName());
        }
        values.add(new MaleChild());


    }
    public static void passBaseandParentSuper(List<?  super Integer> values)
    {
        values.add(21);
        values.add(2);
//        values.add(90.5)
    }
}

class Parent1 {

    public void eat() {
        System.out.println("eating");
    }
}
class Child1 extends Parent1 {
    @Override
    public void eat() {
        System.out.println("eating(CHILD1)");
    }
}
class Child2 extends Parent1
{
    @Override
    public void eat() {
        System.out.println("eating(CHILD2)");
    }
}
class MaleChild extends Child1
{

}
