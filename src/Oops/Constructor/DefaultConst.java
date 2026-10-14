package Oops.Constructor;
class Student
{
    int rno;
    String name;
    Student()
    {
        this(12,"shankar");

    }
    Student(int rno,String name)
    {
        this.rno=rno;
        this.name=name;
    }
    Student(Student otherStudent)
    {
       this.rno= otherStudent.rno;
       this.name=otherStudent.name;
    }
    void greeting()
    {
        System.out.println("hello my name is:"+name);
    }
    void changeRno(int rno)
    {
        this.rno=rno;
    }
}
public class DefaultConst {
    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name);
        Student s2=new Student();
        System.out.println(s2.name);
        Student s3=new Student(12,"ramesh");
        System.out.println(s3.name);
        s2.greeting();
        s2.changeRno(14);
        s3.greeting();
        Student s4=new Student(s3);
        System.out.println(s2.rno);
        System.out.println(s4.rno);
        System.out.println(s4.name);
        Student s5=new Student();
        System.out.println(s5.name);

    }
}
