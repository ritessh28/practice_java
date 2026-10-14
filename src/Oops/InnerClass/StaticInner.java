package Oops.InnerClass;
 class OuterTest
{
    private int a=100;
    static class InnerTest
    {
        String name;
        public InnerTest(String name) {
            this.name = name;
            OuterTest ot=new OuterTest();
            System.out.println("value of private variable a is:"+ot.a);
        }
    }

    public static void main(String[] args) {
        InnerTest a1=new InnerTest("rohit");
        InnerTest a2=new InnerTest("rakesh");
        System.out.println(a1.name);
        System.out.println(a2.name);
        OuterTest ot=new OuterTest();
        InnerTest a4=new InnerTest("ram");





    }

}
public class StaticInner {
    public static void main(String[] args) {
        OuterTest.InnerTest it= new OuterTest.InnerTest("ramesh");
        System.out.println(it.name);
        OuterTest.InnerTest obj=new OuterTest.InnerTest("ramu");
//        InnerTest m1=new InnerTest();




    }
}
