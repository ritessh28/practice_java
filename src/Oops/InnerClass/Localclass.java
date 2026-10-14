package Oops.InnerClass;

import java.util.Locale;

public class Localclass {
    int no=100;
    public Object greet()
    {
        int y=20;
//        y++;// cannot reassign value to local variable in method because in class by default it does
        //int y=20 again so its get confused unambiguous which y to assign effective final or final
        class Local
        {
            int y=20; // by default behaviour final int y=20;
            int x=10;
            void sayHi()
            {
                System.out.println(y);
            }
            void add(int a,int b)
            {
                System.out.println(a+b);
            }
            void add(int a,int b,int c)
            {
                System.out.println(a+b+c);
                System.out.println(no);
                System.out.println(y);
            }

        }
        Local l=new Local();
        l.sayHi();
        l.add(2,4);
        return l;
    }
    public void fun()
    {
        Object obj=greet();
        this.greet();
    }

    public static void main(String[] args) {
        Localclass o1=new Localclass();
        o1.greet();
        o1.fun();
    }
}
