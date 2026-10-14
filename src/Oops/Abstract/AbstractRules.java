// can abstract class be final=> no
// can abstract class have constructors=>yes and can be called using super.abstract class name
// can abstract class have private methods =>yes and can be called from other method wihin the class but not abstract
// can abstract class have static methods variables and blocks =>yes
// can abstract class have final methods =>yes but non-abstract
// can abstract class have no abstract methods=> yes
package Oops.Abstract;
abstract class Rules
{
    int age;
    static int n;
    int instance;
    public Rules(int age)
    {
        this.age=age;
    }
    private void privatem1()
    {
        System.out.println("inside private method");
    }
    static void s1()
    {
        System.out.println("inside static method s1");
    }
    final void f1()
    {
        System.out.println("inside final method f1");
        this.privatem1();
    }
    static
    {
        System.out.println("inside static block");
        n=100;

    }
}
public class AbstractRules  extends Rules{
    String name;
    public AbstractRules(String name,int age)
    {
        this.name=name;
        super(age);
    }
//    public void privatem1()
//    {
//        System.out.println("inside private method child class");
//    }
    public static void main(String[] args) {
        AbstractRules obj=new AbstractRules("ritesh",20);
        System.out.println(obj.age+"  "+obj.name);
//        obj.privatem1();
          obj.f1();
          Rules obj2=new AbstractRules("shankar",20);
          System.out.println(Rules.n);

    }

}
