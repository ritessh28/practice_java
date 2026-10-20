package CollectionFramework.Comparable;

import java.util.*;

public class EmployeeComparable {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"ramesh","pune",22));
        list.add(new Employee(2,"mohan","goa",20));
        list.add(new Employee(1,"aditya","pune",20));
        list.add(new Employee(1,"akash","goa",19));
        Collections.sort(list);
        for(Employee e:list)
        {
            System.out.println("age: "+e.age+" name :"+ e.name);
        }
        Set<Employee> tree=new TreeSet<>();
        tree.add(new Employee(1,"ramesh","pune",22));
        tree.add(new Employee(2,"rakesh","pune",22));
        System.out.println(tree.size());
        for(Employee e:tree)
        {
            System.out.println("age: "+e.age+" name :"+ e.name);
        }
    }

}
class Employee implements Comparable<Employee>
{
    int empId;
    String name;
    String address;
    int age;
    public Employee(int empId,String name,String address,int age)
    {
        this.empId=empId;
        this.name=name;
        this.address=address;
        this.age=age;

    }
    @Override
    public int compareTo(Employee other) {
        if (this.age!=other.age) {
            System.out.println("age comaprison");
            return this.age - other.age;
        }
        System.out.println("name comparison");
        return this.name.compareTo(other.name);
    }
}
//in tree set elements are added based on compare to method not hashcode or equals
//in this compareTo we are checking if there age is equal if yes  we are checking their name
// duplicates are not allowed in tree so if age is equal we are checking based on name