package Immutable;

public class Demo {
    public static void main(String[] args) {
        Student s1=new Student(22,"ritesh");
//        s1.name="shankar";//Student object is immutable we cannot change the fields of object variables and methods
        System.out.println(s1.getAge());
        System.out.println(s1.getName());



    }
}
final class Student//Immutable class
{
    private final int age;
    private final String name;
    public Student(int age,String name)
    {
        this.age=age;
        this.name=name;
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