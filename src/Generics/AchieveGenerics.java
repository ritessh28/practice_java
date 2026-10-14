package Generics;

public class AchieveGenerics {
    public static void main(String[] args) {
        Box1 <Integer> b1=new Box1<>(20);
        Box1<String> b2=new Box1<>("String");
        Box1<Integer>b3=new Box1<>(30);
//        System.out.println(b1.obj);
        System.out.println(b1.getter());
        Box1<String> b4=new Box1<>();
        b1.setter((Integer) 10);
        System.out.println(b1.getter());

    }
}
class Box1 <T>
{
    T ref;
    Object obj=ref;
    Box1(T ref)
    {
        this.ref=ref;
        System.out.println(ref.getClass().getName());
        Object obj=ref;
        System.out.println(obj);
    }
    Box1()
    {

    }
    public T getter()
    {
        return ref;
    }
    public void setter(T ref)
    {
        this.ref=ref;
    }
}