package Oops.Abstract;

public class Student1 extends College {
    public Student1(int rno)
    {
        super(rno);
    }
    public void chooseDepartment(String dept)
    {
        System.out.println("student 1 is choosing"+dept+" department");
    }
    public void specialistaion()
    {
        System.out.println("specialisation :AI/ML");
    }
    public void s1()
    {
        System.out.println("inside student1 s1  method");
    }

    @Override
    public void UniversityName() {
        super.UniversityName();
    }
}
