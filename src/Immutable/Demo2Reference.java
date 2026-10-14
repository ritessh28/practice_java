package Immutable;

public class Demo2Reference {
    public static void main(String[] args)
    {
        College clg=new College("gogte","rpd");
        Student1 s1=new Student1(22,"rahul",clg);
        System.out.println(clg.name);
        College c2=s1.getCollege();
        Student1 s2=new Student1(s1.getAge(),s1.getName(),s1.getCollege());
        System.out.println(clg.name);
        System.out.println(c2==clg);
        System.out.println(s1==s2);
        // true cause both reference var points to same objects in heap
        // example of shallow copy
        // references objects in Student class are same that is clg
        // but Top Student class Objects are different s1 and s2 points to different objects
        // but clg references are same


        System.out.println(s1==s2);
        System.out.println(s1.getCollege().equals(s2.getCollege()));//same cause in both same clg reference is used
        System.out.println(s1.getCollege());
        System.out.println(s2.getCollege());
        System.out.println(s1.getCollege().name.equals(s2.getCollege().name));
        System.out.println(s1.getCollege().name);
        s2.getCollege().name="kle";
        System.out.println(s1.getCollege().name);
        System.out.println(s1.getCollege().name);
        // changes made through s2 also affects the value of object in s1
        // cause both points to same college object instead we can say both have
        // same address of clg object as reference in Student object
    }
}
final class College//mutable class not im
{
    String name;
    String location;
    public College(String name,String location)
    {
        this.name=name;
        this.location=location;
    }
}
final class Student1
{
    private int age;
    private String name;
    private College clg;
    public Student1(int age,String name,College clg)
    {
        this.age=age;
        this.name=name;
        this.clg=clg;
    }
    public College getCollege()
    {
        return this.clg;
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
