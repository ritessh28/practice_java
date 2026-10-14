package CollectionFramework.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomEmployeeClassIterator {
    public static void main(String[] args) {
        Employee e1=new Employee("ritesh",22,"pune");
        Employee e2=new Employee("rakesh",21,"pune");
        Employee e3=new Employee("rohit",24,"mumbai");
        List <Employee> empList=new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        EmployeeContainer ec=new EmployeeContainer(empList,empList.size());
//        System.out.println(empList.getFirst().name);
//        System.out.println(empList.size());
        Iterator<Employee> iterate= ec.iterator();
        while(iterate.hasNext())
        {
            System.out.println(iterate.next().name);
        }
        for(Employee e:empList)
        {
            System.out.println(e.name);
        }

    }
}
class Employee
{
    String name;
    int emp_id;
    String address;
    public Employee(String name,int emp_id,String address)
    {
        this.name=name;
        this.address=address;
        this.emp_id=emp_id;
    }
    public Employee()
    {

    }
    public String getName()
    {
        return this.name;
    }
    public int getEmp_id()
    {
        return this.emp_id;
    }
    public String getAddress()
    {
        return this.address;
    }
}
 class EmployeeContainer extends Employee implements Iterable<Employee> {
     //     public EmployeeContainer(String name, int emp_id, String address) {
//         super(name, emp_id, address);
//     }

      List<Employee> list;
      int size;

     public EmployeeContainer(List<Employee> list,int size ){
         this.list=list;
         this.size=size;

     }

     @Override
     public Iterator<Employee> iterator() {
         return new EmployeeIterator();
     }

     class EmployeeIterator implements Iterator<Employee> {
         int pos = 0;
         @Override
         public boolean hasNext() {
             System.out.println(size);
             return pos<size;
         }
         @Override
         public Employee next()
         {
             Employee emp=list.get(pos++);
//             pos++;
//             System.out.println(pos);
             return emp;

         }
     }
 }
 // for enhanced loop also works as similar as iterator
// behind the scene it does what iterator does
// but to iterate through elements of a particular collection type we need to implement Iterator
// otherwise we won't be able to use for enhanced loop cause behind the scene it does implement
// what we explicitly implement for iterator so
// it works on an array or iterable type so our class to be iterable we need to implement iterable interface
