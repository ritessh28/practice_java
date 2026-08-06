package Oops.Inherit;
class FoodItems
{
    void fooditems()
    {
        System.out.println("food Items represent things we eat");
    }
}
interface Price
{
    void price();
}
interface Type
{
    void type();
}
interface Name
{
    void name();
}
class Fruit extends FoodItems implements Price, Name
{
   public void price()
   {
       System.out.println("the price of 1 apple is 30");
   }
   public void name()
   {
       System.out.println("Apple is the name of the fruit");
   }
}
class Mango extends Fruit implements Type, Price, Name
{
   public void price()
   {
       System.out.println("the price of 1 Mango is 40");
   }
   public void name()
       {
        System.out.println("Mango is the name of the fruit");
       }
   public void type()
    {
       System.out.println("the type of mango is Alphonso");
   }
}
public class Hybrid1 {
    public static void main(String[] args) {
//        Mango m=new Mango();
//        m.fooditems();
//        m.name();
//        m.price();
//        m.type();
//        Fruit f=new Fruit();
//        f.name();
//        f.price();
        Fruit f1=new Mango();
        f1.name();
        f1.price();
        ((Mango)f1).type();
        Mango f2=(Mango)f1;
        f2.type();
    }
}
