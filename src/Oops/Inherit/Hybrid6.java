package Oops.Inherit;
class Book
{
    void  book()
    {
        System.out.println("Reading book improves our Knowledge");
    }
}
interface Namea1
{
    void nameOfTheBook();
}
interface Pricea1
{
    void priceOfTheBook();
}
class TextBook extends Book implements Namea1, Pricea1
{
    public void nameOfTheBook()
    {
        System.out.println("The Monk Who Sold his Ferrari");
    }
    public void priceOfTheBook()
    {
        System.out.println("Price is 800");
    }
}
class JavaBook extends Book implements Pricea1,Namea1
{
    public void priceOfTheBook()
    {
        System.out.println("1000");
    }
    public void nameOfTheBook()
    {
        System.out.println("Fundamentals of Java");
    }
}
public class Hybrid6 {
    public static void main(String[] args)
    {
        JavaBook jb = new JavaBook();
        jb.nameOfTheBook();
        jb.priceOfTheBook();
        jb.book();
    }
}

