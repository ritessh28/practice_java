package Annotation;

import java.lang.annotation.*;

public class StudentMain {
    static void main(String[] args) {
        Student s=new Student("ritesh",21,201);
        Class gotClass=s.getClass();
        Annotation an=gotClass.getAnnotation(ExtraDetails.class);
        ExtraDetails ed=(ExtraDetails) an;
        System.out.println("college name :"+ed.clgName());
        System.out.println("date of birth :"+ed.dateOfBirth());
    }
}


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.TYPE,ElementType.METHOD})
@interface ExtraDetails
{
    String clgName() default "reva";
    String dateOfBirth() default "00-00-0000";
}
@ExtraDetails(clgName ="gogte",dateOfBirth = "28-04-2004")
class Student
{
    String name;
    int age;
    int rollNo;

//    @ExtraDetails
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

//    @ExtraDetails
    public Student(String name,int age,int rollNo)
    {
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }

}