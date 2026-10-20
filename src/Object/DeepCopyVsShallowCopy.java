package Object;
class Marks
{
    int value;
    public Marks(int value)
    {
        this.value=value;
    }
}
class Student1
{
    int age;
    String name;
    Marks marks;

    public Student1(int age, String name, Marks marks) {
        this.age = age;
        this.name = name;
        this.marks=marks;
    }
    public static  Student1 ShallowCopy(Student1 other)
    {
        return new Student1(other.age,other.name,other.marks);
    }
    public static Student1 DeepCopy(Student1 other)
    {
        return new Student1(other.age,other.name,new Marks(other.marks.value));
    }
}
public class DeepCopyVsShallowCopy {
    public static void main(String[] args) {
        Student1 s1=new Student1(20,                     "ritesh",new Marks(67));
        Student1 s2=Student1.ShallowCopy(s1);
        System.out.println(s1==s2);
        System.out.println(s1.marks==s2.marks);
        s1.marks.value=25;
        System.out.println(s2.marks.value);
        Student1 s3=Student1.DeepCopy(s1);
        System.out.println(s3==s1);
        s1.marks.value=300;
        System.out.println(s3.marks.value);
        System.out.println(s1.marks.value);



    }
}
