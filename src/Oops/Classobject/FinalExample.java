package Oops.Classobject;

public class FinalExample {
    public static void main(String[] args) {
        final B obj=new B();
        B obj2=new B();
        obj.name="ritesh";
        obj.age=20;
//       obj=obj2;// when a class is declared as final we cannot inherit it,and even we cannot change the reference
        // variable and object it is pointing to it  always point to the same object see the above initialization
        obj.name="ramesh";
        obj.age=22;
        //obj.num=200;// when a primitive is declared as final we cannot reassign value to it
        System.out.println(obj.age);
        B a1=new B();
        B a2=new B();
        B a3=new B();
        for(int i=0;i<100000;i++)
        {
            a1=new B();;
        }
        a1=a2;
        a3=a2;

    }
}
class  B
{
    final int num=20;
    String name;
    int age;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object destroyed");
        super.finalize();
    }
}


