package Oops.Polymorphism;
class Shape
{
    public void area()
    {
        System.out.println("area method of class Shape");
    }
}
class Circle extends Shape
{
    public void area()
    {
        System.out.println("area method of class Circle");
    }
    public void m1()
    {
        System.out.println("m1 method of class Circle");
    }
}
class Square extends Shape
{
    public void area()
    {
        System.out.println("area method of class Square");
    }
}
public class TypeCast {
    public static void main(String[] args) {
        Shape circ=new Circle();
        circ.area();
        Circle ch=(Circle) circ;
        ch.m1();
        Shape s1=ch;
        s1.area();
//       Square sq=(Square)ch;
        // cannot be downcasted because sqaure is independent class ,and we are passing object of circle not square

    }
}
