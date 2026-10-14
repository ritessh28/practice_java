package Immutable;

public class WithoutReference {
    public static void main(String[] args) {
        Employee e1=new Employee(2,"rohit");
        System.out.println(e1.getId());
        Employee e2=new Employee(3,"shreyash");

    }
}
final class Employee
{
        private final int id;
        private final String name;
        public Employee(int id,String name)
        {
            this.id=id;
            this.name=name;
        }
        public int getId()
        {
            return this.id;
        }
        public String getName()
        {
            return this.name;
        }

}
// immutable class rules
/* 1. make the class final so any other cannot extend it and change the state of object ie change the field/variables
   2. make the field private and final private because we cannot access this variables/ fields in another class and
       change the value of those fields final because we need to keep it constant unchangeable value once
       assigned should never change
   3. allow only getter not setter because with the use of setter we can change the value of a field
   4. for reference type as a field in a class when it is being initialized with a object in either constructor or through
       setter always assign new object to it  so the old object doesn't get modified
   5. make defensive copy for reference type deep copy every time new object gets created
 */