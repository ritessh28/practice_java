package Oops.Polymorphism;
class ParentCovariant
{
    ParentCovariant returnParent(ParentCovariant objParent)
    {
        return objParent;
    }
    Object returnObject(Object obj)
    {
        ParentCovariant pc=new ParentCovariant();
        return pc;
    }
}
class ChildCovariant extends ParentCovariant
{
    @Override
    ChildCovariant returnParent(ParentCovariant childObj)
    {
        return new ChildCovariant();
    }

    @Override
    Object returnObject(Object obj) {
        return new ChildCovariant();
    }
}
public class Covariant {
    static void main(String[] args) {
        ParentCovariant obj=new ChildCovariant();
        obj.returnParent(obj);
        System.out.println(obj.getClass());
//        ChildCovariant ob= (ParentCovariant) new ChildCovariant();
//        ob.returnObject(obj);
        ChildCovariant cb= (ChildCovariant) new ParentCovariant();
        cb.returnObject(obj);



    }
}
