package Object;

import java.util.Objects;

class Address
{
    String location;
    public Address(String location)
    {
        this.location=location;
    }
}
class Employee implements Cloneable
{
    int id;
    String name;
    Address address;
    public Employee(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    @Override
    public String toString()
    {
        return "{Employee}"+"name:"+this.name+" id:"+this.id+" Address:"+this.address.location;
    }
    @Override
    public int hashCode()
    {
//        int result=17;
//        result=result*31+id;
//        result=result*31+((name==null)?0:name.hashCode());
//        return result;
        return Objects.hash(id,name);

    }
    @Override
    public boolean equals(Object obj)
    {
        if(this.getClass()!=obj.getClass())
            return false;
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        Employee employee=(Employee) obj;
        return this.name==employee.name &&this.id==employee.id&&this.address.location==employee.address.location;
    }

}
public class MoreMethods {
    public static void main(String[] args)  throws CloneNotSupportedException{
        Employee emp=new Employee(21,"ritesh",new Address("belgaum"));
        Employee e2=new Employee(25,"ramesh",new Address("belgaum"));
        System.out.println(emp.hashCode());
        System.out.println(e2.hashCode());
        Employee e3=(Employee) emp.clone();
        System.out.println(emp.address==e3.address);
        System.out.println(emp.equals(e3));
        System.out.println(e2.equals(emp));




    }
}
