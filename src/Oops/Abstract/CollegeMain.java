package Oops.Abstract;

public class CollegeMain {
    public static void main(String[] args) {
        College s1=new Student1(203);
        s1.chooseDepartment("Cs");
        s1.specialistaion();
        System.out.println(s1.rno);
        College.clgName();
        College s2=new Student2(204);
        s2.chooseDepartment("enc");
        s2.specialistaion();
        System.out.println(s2.rno);
        College.clgName();
        System.out.println(College.count);
        s2.UniversityName();
//        s1.s1();


    }
}
