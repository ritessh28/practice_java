package Immutable;

public class Demo3ReferenceImmu {
    public static void main(String[] args)
    {
        College2 c1=new College2("samiti","ramdev");
        Student2 s1=new Student2(25,"vikash",c1);
        Student2 s2=new Student2(25,"kunal",c1);
        System.out.println(s1.getCollege());
        System.out.println(s2.getCollege());
        System.out.println(s1.getCollege().name);
        System.out.println(s1.getCollege().name="gss");
        System.out.println(s1.getCollege().name);
        Student2 s3=new Student2(22,"rahul",s1.getCollege());
        System.out.println(s3.getCollege().name);
        //name is same as it was assigned at the time of  creation of object because of deep copy
        // even though we have tried changing the name as it has separate copy of its own it remains

    }
}
final class College2//Immutable class
{
    String name;
    String location;
    public College2(String name,String location)
    {
        this.name=name;
        this.location=location;
    }
}
final class Student2
{
    private int age;
    private String name;
    private College2 clg;
    public Student2(int age,String name,College2 clg)
    {
        this.age=age;
        this.name=name;
        this.clg=new College2(clg.name,clg.location);
    }
    public College2 getCollege()
    {
        return new College2(clg.name,clg.location);
    }
    public String getName()
    {
        return this.name;
    }
    public int  getAge()
    {
        return this.age;
    }
}
// rules for making a class immutable
// 1. make the class final so another class cannot change the state of object and extend it
// 2. make the variable private and final
// 3. avoid setters only getters
// 4. make deep copy in constructors and getters means return new object everytime