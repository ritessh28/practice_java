package Java8.MethodReference;

import java.util.function.*;

public class ConstructorReference2 {
    public static void main(String[] args) {
        BiFunction<Integer,String,Student> student=Student::new;
        Student s=student.apply(22,"danish");
        System.out.println(s.age+" "+s.name);
        System.out.println(student.apply(21,"gourav").age);
        Student s1=new Student(29,"timothe");
        Student s2=s1;

    }
}
class Student
{
    int age;
    String name;
    public Student(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
}
//syntax for constructor reference
//classname::new