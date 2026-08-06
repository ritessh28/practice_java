package Oops.Inherit;
class Product
{
    void category()
    {
        System.out.println("there are multiple category of products");
    }
}
interface Price1
{
    void price();
}
interface Purchase
{
    void purchase();
}
class HomeProduct extends Product
{
    void homeProduct()
    {
        System.out.println("there are multiple Home products Available");
    }
}
class BeautyProduct extends Product
{
    void beautyProduct()
    {
        System.out.println("Beauty products helps to improve our beauty");
    }
}
class FaceCare extends BeautyProduct implements Price1 , Purchase
{
    public void  beautyProduct()
    {
        System.out.println("Beauty products helps to improve our Face");
    }
    public void purchase()
    {
        System.out.println("Purchasing Beauty Product");
    }
    public void price()
    {
        System.out.println("Price of Beauty Products is above 200");
    }
}
public class Hybrid2 {
    public static void main(String[] args) {
        FaceCare fc=new FaceCare();
        fc.category();
        fc.purchase();
        fc.price();
        fc.beautyProduct();
    }
}
