package Oops.Abstract;
abstract class Fruit
{
    void eatable()
    {
        System.out.println("All Fruits are Eatable");
    }
    Fruit()
    {
        System.out.println("All Fruits are Eatable");
    }
//    abstract void name();
//    abstract void color();
}
class AnyFruit extends Fruit
{
    String color;
    String name;
//    public void name() {
//        System.out.println("name of the fruit is Mango");
//    }
//    public void color() {
//        System.out.println("color of the fruit is Yellow");
//    }
    AnyFruit(String name,String color)
    {
        this.name=name;
        this.color=color;
        System.out.println("name of fruit "+this.name+"  color of fruit "+this.color);
    }
}
public class Abstract4 {
    public static void main(String[] args) {
       AnyFruit mango=new AnyFruit("mango","yellow");
       System.out.println(mango.hashCode());
       mango.hashCode();
       mango.eatable();


    }
}
