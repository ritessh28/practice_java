package Static;

import java.awt.color.ICC_ColorSpace;

public class Two {
    public static void main(String[] args) {
        Student s1=new Student(01,"ritesh",201);
        Student s2=new Student(02,"ramesh",202);
        System.out.println(Student.studentsJoined);
        Two t1=new Two();
        t1.greeting();
    }
    static void hello()
    {
        System.out.println("hello how are you:");
//        Two t=new Two();
//        t.greeting();
    }
    void greeting()
    {
        System.out.println("good night");
        hello();
        namaste();
    }
    void namaste()
    {
        System.out.println("namaste how are you");
    }
}

