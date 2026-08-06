package Oops.Inherit;
class Course
{
  void info()
  {
      System.out.println("course provide a structured way of Learning");
  }

}
interface Duration
{
    void duration();
}
interface Certification
{
    void certification();
}
class JavaCourse extends Course implements Duration,Certification
{
    public void  duration()
    {
        System.out.println("the duration of java course is 8 months");
    }
    public void certification()
    {
        System.out.println("This Course Provides 2 certificates");
    }

}
class PythonCourse extends Course implements Duration,Certification
{
    public void duration()
    {
        System.out.println("the duration of python course is 6 months");
    }
    public void certification()
    {
        System.out.println("This Course Provides 4 certificates");
    }

}
public class Hybrid5 {
    public static void main(String[] args)
    {
        JavaCourse j=new JavaCourse();
        j.duration();
        j.certification();
        j.info();
    }
}
