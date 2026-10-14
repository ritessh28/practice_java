package Oops.InnerClass;
interface Greeter {
    void greet(String name);
}
public class Demo implements Greeter{
    public static void main(String[] args) {
        Greeter g1=new Demo() {
            @Override
            public void greet(String name) {
                System.out.println("good morning"+name);
            }

        };
        g1.greet("ramesh");
        Greeter g2=name ->
        {
            System.out.println("good afternoon "+name);

        };
        g2.greet("rakesh");
        Greeter obj=new Demo();
        obj.greet("ritesh");

    }
    @Override
    public void greet(String name) {
        System.out.println("good morning "+name);
    }
}
