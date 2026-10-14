package Object;

import Static.StackOverflow;

import java.util.Objects;

public class ObjectMethods {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1=new Person(22,"rahul");
        Person p2=new Person(24,"ramesh");
        System.out.println(p1);
        System.out.println("************");
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        Integer ir=new Integer(10);
        p1.equals(ir);
        System.out.println(p1.getClass().getName());
        Person p3=null;
        System.out.println(p1.equals(p3));
        Person obj=new Person(22,"ritesh");
        Person obj2=new Person(22,"ritesh");
        Person obj3=new Person(22,null);
        System.out.println(obj.hashCode()==obj2.hashCode());
        System.out.println(obj.hashCode()==obj3.hashCode());
        System.out.println("**************");
        Person s1=new Person(22,"ramesh");
        Person s2=null;
        Person s3=(Person) s1.clone();// performs shallow copy
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

    }
}
class Person extends Object implements Cloneable
{
    int age;
    String name;
    public Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return "Name:"+this.name+",Age:"+this.age;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)//checks if the passed object is null
            return false;
        if(obj.getClass()!=this.getClass())
            return false;// checks if both classes are of same type in our case Person
        // if false classcast exception
        System.out.println(this.getClass());
        Person p=(Person) obj;
        if(this==p)// checks if both reference var points to same memory location or object in heap
            return true;
//        if(obj instanceof Person p)
//            return this.age==p.age && this.name==p.name;
        return this.age==p.age && this.name==p.name;


    }
    @Override
    public int hashCode()
    {
//        int result=17;
//        result=result*31+age;
//        result=result*31+((name==null)?0:name.hashCode());
//        return result;
        return Objects.hash(name,age);

    }
    //if two objects are equal then their hashcode must be equal

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}