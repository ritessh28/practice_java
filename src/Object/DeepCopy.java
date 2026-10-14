package Object;
class Student
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.age=age;
        this.name=name;
    }
    Student(Student other)
    {
        this.name=other.name;
        this.age=other.age;
    }
    Student()
    {

    }
    public void clonee(Student other)
    {
//        Student s2=new Student(this.name,this.age);
//        return s2;
//        other=new Student(this.name,this.age);
//        return other;
        this.age=other.age;
        this.name=other.name;

    }
    static Student copyOf(Student other)
    {
        return new Student(other.name,other.age);
    }


}
public class DeepCopy {
    public static void main(String[] args) {
        Student s1=new Student("ritesh",21);
        Student s3=new Student(s1);
        System.out.println(s3.name.equalsIgnoreCase(s1.name));
        System.out.println(s1.age==s3.age);
        Student s4 = new Student();
        s4.clonee(s1);
        System.out.println(s1.age==s4.age);
        Student s5=Student.copyOf(s1);
        System.out.println(s5==s1);
        System.out.println(s5.name);
    }
}
