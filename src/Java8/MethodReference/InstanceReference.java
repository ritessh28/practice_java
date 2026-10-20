package Java8.MethodReference;

import java.util.function.Supplier;

public class InstanceReference {
    public static void main(String[] args) {
        Employee emp=new Employee(1,"ramesh");
        Supplier<Integer> id=emp::getId;
        System.out.println(id.get());
        Supplier<String> name=emp::getName;
        System.out.println(name.get());


    }
}
class Employee
{
    int id;
    String name;
    public Employee(int id ,String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}
//syntax for instance reference
//objectName::methodName
//we cannot directly access instance method with classname cause object is needed to access instance method
//we are storing it in supplier cause we are not accepting/passing any argument but returning something