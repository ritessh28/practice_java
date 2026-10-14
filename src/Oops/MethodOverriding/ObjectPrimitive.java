package Oops.MethodOverriding;

public class ObjectPrimitive {
}
class Parent1
{
    public Object show(Object x)
    {
        Object obj=new Object();
        return obj;
    }
}
class Child4 extends Parent1
{
    @Override
    public Integer show(Object y)
    {
        return 3;
    }

}