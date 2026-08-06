package Oops.Abstract;
abstract class HumanBeing
{
    static int x;
    static  void  speaking()
    {
        System.out.println("all humans speak");
    }
    void walking()
    {
        System.out.println("all humans walk");
    }
    abstract void gender();
    abstract void age();

}
class Male extends HumanBeing
{
    public void gender()
    {
        System.out.println("Male gender");
    }
    public void age()
    {
        System.out.println("Male age is 40");
    }
}
class Female extends HumanBeing
{
    public void gender()
    {
        System.out.println("Female gender");
    }
    public void age()
    {
        System.out.println("Female age is 30");
    }
}
public class Abstraction3 {
    public static void main(String[] args) {
        Female f=new Female();
        f.walking();
        f.gender();
        f.age();
        f.x=20;
        HumanBeing.speaking();
        Male m=new Male();
        m.x=40;
//        HumanBeing.x=30;
        System.out.println("value of x is"+f.x);

    }
}
