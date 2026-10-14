package Oops.Abstract;

public class Student2 extends College {

    public Student2(int rno) {
        super(rno);
    }

    @Override
    public void chooseDepartment(String dept) {
        System.out.println("student 2 is choosing "+dept+" department");
    }

    @Override
    public void specialistaion() {
        System.out.println("specialisation : ENC");
    }
}
