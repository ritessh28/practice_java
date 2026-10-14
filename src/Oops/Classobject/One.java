package Oops.Classobject;

import java.util.Arrays;

class Student
{
    int age;
    String name;
    Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
}
public class One {
    public static void main(String[] args) {
        Student s1=new Student(18,"shankar");
        Student s2=s1;
        s2.age=45;
        System.out.println(s1.age);
        System.out.println(s2.age);
        Student s3;
//        System.out.println(s3.name);
        Student []std=new Student[4];
        System.out.println(Arrays.toString(std));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 instanceof Student);
        boolean b=s1 instanceof Student;



    }

}
