package Generics;

public class TypeErasures {
    public static void main(String[] args) {
        Parents<String> obj=new Childs();
        System.out.println(obj.returnValue());
        Parents<Integer>p1=new Parents<>();
        System.out.println(p1.returnValue());
    }

}
class Parents<T>
{

    public T returnValue()
    {
        return null;
    }
}
//converts into
/*
class Parent
{
    public Object returnValue()
    {

    }
}
 */
class Childs extends Parents<String>
{
    @Override
    public String returnValue()
    {
        return "hello";
    }

}
//class Child extends  Parent
//{
//    @Override
//    public Object returnValue()
//    {
//        return this.returnValue()
//    }
//}
// this is called compiler generated bridge method
// if we have override the method of parent class with generics in subclass with specific type
// in our example as string
// the child class with generics also gets converted to Object for generic
// as shown above
// and then compiler creates bridge method calling method of child class
// with specific type to avoid confusion for overriding
// and the Generic type which gets converted to object type after compilation is type erasure
// during compilation its present for type checking
// but after compilation jvm removes it before java 5 raw types were used
// list l=new ArrayList(); without specifying generic type
// we can add any type of value in this list
// as it was used before like this
// using generic checking after compilation could cause trouble to the classes declared with raw types
// so type erasures are used
// and primitive cant be used for specifying generic type because
// primitives live in stack and while type checking the type gets converted to Object
// so as primitive dont have a class then they do not extend Object class
// and object represents reference type which points to object
// and primitive  variables  are  like a container that hold the value itself in stack
// Primitives can't be generic type arguments because after type erasure
// T becomes Object, and primitives are not objects (not subtypes of Object).
// A primitive variable holds the raw value itself; an object variable
// holds a reference to an object. Use wrappers (Integer, Double...) instead.