package Generics;

import Static.StackOverflow;

public class Demo2 {
    public static void main(String[] args) {
        Container<Integer> c1=new Container<>(2,4);
        System.out.println(c1.getValue());
        Container<String> c2=new Container<>("java","ds");
        System.out.println(c2.getValue());
        Container<Boolean> c3=new Container<>();
        c3.setValue(true,false);
        System.out.println(c3.getValue());
        Container<Integer> c4=new Container<>();
        c4.SetNumbers(2,10);
//        System.out.println(c4.getValue());
        c4.getNumbers();

        System.out.println("**********************");
        Container2<String,Integer> s1=new Container2<>();
        s1.setFirstValue("hello");
        s1.setSecondValue(2);
        System.out.println(s1.getFirstValue());
        System.out.println(s1.getSecondValue());
        Container2<Boolean,String> s2=new Container2<>(true,"java");
        System.out.println(s2.getFirstValue());
        System.out.println(s2.getSecondValue());




    }
}
class Container<T>
{
    T a,b;
    T n1,n2;
    T m1,m2;
    public Container(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    public Container()
    {

    }
    public T getValue()
    {
        System.out.println("value is:"+a+" "+b);
//        return (T) a;
        return a;
    }
    public void setValue(T a,T b)
    {
        this.a=a;
        this.b=b;
    }
    public void SetNumbers(T n1,T n2)
    {
        this.n1= n1;
        this.n2=n2;
//        this.m1= (T) n1;

    }
    public void getNumbers()
    {
        System.out.println("value is:"+n1+" "+n2);
    }
}
class Container2 <ONE,TWO>
{
    ONE val1;
    TWO val2;
    public Container2(ONE val1,TWO val2)
    {
        this.val1=val1;
        this.val2=val2;
    }
    public Container2()
    {

    }
    public ONE getFirstValue()
    {
        return val1;
    }
    public TWO getSecondValue()
    {
        return val2;
    }
    // issue declares a new method level type parameter same as class Ones
    // so cannot use this here as new method level type parameter is used which could be different
//    public <ONE> void setFirstValue(ONE val1) {// issue
//        val1=val1;
//    }
//    public <TWO> void setSecondValue(TWO val2)
//    {
//        this.val2=(TWO) val2;
//    }
      public void setFirstValue(ONE val1)
      {
          this.val1=val1;
      }
    public void setSecondValue(TWO val2)
    {
        this.val2=val2;
    }

}