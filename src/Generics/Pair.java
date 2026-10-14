package Generics;

public class Pair {
    public static void main(String[] args) {
        Demo<Integer,Double> d=new Demo(2,4);
//        Demo2<String,Double> str=new Demo<>("gokak",20.6);
//        Demo2<Integer,String> s1=new Demo<>(20,"ram");
//        System.out.println("pair is "+str.x+", "+str.y);

    }
}
class Demo <T,U>
{
    T x;
    U y;
    public Demo(T x,U y)
    {
        this.x=x;
        this.y=y;
    }

}