package Oops.Abstract;

abstract public class College {
     int rno;
     static int count=0;
     public College(int rno)
     {
         this.rno=rno;
         count++;
     }
    static void clgName()
    {
        System.out.println("college name is :gcc bca");
    }
    public void UniversityName()
    {
        System.out.println("Rani chennama University");
    }
    abstract public void chooseDepartment(String dept);
    abstract public void specialistaion();



}

