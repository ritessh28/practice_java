package Oops.Encapsu;
class Employee
{
    private String name,city;
    private int eno;
    void setEmployeeDetails(String name,String city,int eno)
    {
        this.name=name;
        this.city=city;
        this.eno=eno;
    }
    void getEmployeeDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Eno: "+eno);
    }
}
public class Encapsulation1
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.setEmployeeDetails("Ramesh","Goa",4);
        e.getEmployeeDetails();
    }
}