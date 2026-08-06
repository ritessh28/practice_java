class Dog
{
    public void display()
    {
        System.out.println("Inside dog method");
    }
}
class Lab extends Dog
{
    public void display()
    {
        System.out.println("Inside lab method");
    }
}
public class Demo {
    public static void main(String[] args) {
        Dog d = new Lab();
        d.display();
    }

}
