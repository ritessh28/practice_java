package Immutable;

public class WithReference {
    public static void main(String[] args) {
        Employee1 e1=new Employee1(2,"ritesh",new Department("IT"));
        System.out.println(e1.getDepartment().getDepartmentName());
//        System.out.println(e1.getDepartment().deptname);

    }
}
final class Department
{
    private final String deptname;
    public Department(String deptname)
    {
        this.deptname=deptname;
    }
    public String getDepartmentName()
    {
        return this.deptname;
    }
}
final class Employee1
{
    private final int id;
    private final String name;
    private final Department dept;
    public Employee1(int id,String name,Department dept)
    {
        this.id=id;
        this.name=name;
        this.dept=new Department(dept.getDepartmentName());
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public Department getDepartment()
    {
        return new Department(dept.getDepartmentName());
    }

}
// immutable class rules
/* 1. make the class final so any other cannot extend it and change the state of object ie change the field/variables
   2. make the field private and final private because we cannot access this variables/ fields in another class and
       change the value of those fields final because we need to keep it constant unchangeable value once
       assigned should never change
   3. allow only getter not setter because with the use of setter we can change the value of a field
   4. for reference type as a field in a class when it is being initialized with a object in either constructor or through
       getter always assign new object to it  so the old object doesn't get modified
   5. make defensive copy for reference type deep copy every time new object gets created
 */