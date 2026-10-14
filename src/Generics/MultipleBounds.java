package Generics;

public class MultipleBounds {
    public static void main(String[] args) {
        MyNumber<Integer>obj=new MyNumber<>();
        System.out.println(obj.print(20));
        Boxx<MyNumber> obj2=new Boxx<>(obj);
        obj2.display();
        System.out.println(obj2.getItem());
    }
}
interface Printable<T>
{
    double print(T a);

}
class MyNumber <T extends Number> implements Printable<T>
{
    public double print(T a)
    {
        double res=a.doubleValue()+10;
        return  res;
    }
}
class Boxx <T extends MyNumber & Printable>
{
    T item;
    public Boxx(T item)
    {
        this.item=item;
    }
    public void display()
    {
        item.print(20);
    }
    public T getItem()
    {
        return item;
    }

}