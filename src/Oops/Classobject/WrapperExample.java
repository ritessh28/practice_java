package Oops.Classobject;

public class WrapperExample {
     int a=10,b=20;
    static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a,b= "+a+b);
    }
    public static void main(String[] args) {
//        swap(a,b);
//        System.out.println("after swapping a,b= "+a+b);
          WrapperExample obj=new WrapperExample();
          obj.swap(obj.a, obj.b);// we cannot swap values of primitive through function because while passing it
        //passes value not reference for primitive
         System.out.println("after swapping a,b= "+obj.a+obj.b);
         int x=10,y=20;
         int temp=x;
         x=y;
         y=temp;
         System.out.println("after swapping x,y= "+x+y);
         Integer e=30;
         Integer f=40;
         swap(e,f);
         System.out.println("after swapping e,f= "+e+" ,"+f);




    }


}
