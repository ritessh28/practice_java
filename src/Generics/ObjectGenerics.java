package Generics;

public class ObjectGenerics {
    public static void main(String[] args) {
        Box2 b1=new Box2(10);
//        System.out.println(b1.getValue()+5);
//        cannot perform addition because an object can hold anything
        // integer string boolean etc so we need to cast from generic to specific type
        // to use library functions or user defined functions
        Integer i=(Integer) b1.getValue();
        System.out.println(i+5);
        Box2 b2=new Box2("ramesh");
        String s1=(String) b2.getValue();
        System.out.println(s1.indexOf("s"));

    }
}
class Box2
{
    Object value;
    public Box2(Object value)
    {
        this.value=value;
    }
    public Object getValue()
    {
        return this.value;
    }
    public void setValue(Object value)
    {
        this.value=value;
    }
}
// problems with this issue
// need to downcast object everytime to specific type
// to perform operations or do something
// can cause runtime errors which may be hard to resolve
// while compilation it may pass but at runtime it may cause error
// type information could be lost
// wrong object could be inserted
//