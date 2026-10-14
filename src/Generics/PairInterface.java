package Generics;

interface PairI<K,V>
{
    K getKey();
    V getValue();

}
class PairContainer <K,V>implements PairI<K,V>
{
    private K key;
    private V value;
    public PairContainer(K key,V value)
    {
        this.key=key;
        this.value=value;
    }
    @Override
    public K getKey()
    {
        return key;
    }
    @Override
    public V getValue()
    {
        return value;
    }
}
public class PairInterface {
    public static void main(String[] args) {
        PairContainer <Integer,String> obj1=new PairContainer<>(1,"ritesh");
        System.out.println("key: "+obj1.getKey()+" ,value: "+obj1.getValue());
        PairContainer <String,Integer> obj2=new PairContainer<>("age",20);
        System.out.println("key: "+obj2.getKey()+" ,value: "+obj2.getValue());
        Employee emp=new Employee("ritesh",22);
        Employee emp1=new Employee("ritesh",22);
        System.out.println(emp1.compareTo(emp1));



    }
}
// we can even have multiple generic type parameter just as class
/*Real-World Example of Generic Interfaces
 A common example of a generic interface in Java is the Comparable<T> interface,
 which is used to impose a natural ordering on objects.
 */

class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }
}
/*In this example, the Comparable<Employee> interface ensures that the Employee objects can be compared based on their
 age.

Summary
1.A generic interface allows you to write interfaces that can handle various types specified at the time of implementation.
2.Type parameters are used to define the type of objects that the interface will work with.
3.You can implement a generic interface by specifying the type or by keeping the implementation generic.
4.Multiple type parameters can be used to work with more than one type at a time.
5.Bounded type parameters restrict the types that can be passed to the generic interface.
6.Wildcards can be used in generic interfaces for flexibility in accepting various types.
7.Generic interfaces in Java are powerful tools that increase the reusability and flexibility of your code by allowing
 you to abstract behaviour across multiple types, while maintaining type safety at compile time.
 */