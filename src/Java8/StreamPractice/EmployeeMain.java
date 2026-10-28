package Java8.StreamPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                new Employee("Ravi", "IT", 50000),
                new Employee("Sita", "IT", 70000),
                new Employee("Amit", "HR", 40000),
                new Employee("Neha", "HR", 45000),
                new Employee("Raj", "Finance", 60000),
                new Employee("Meena", "IT", 70000)
        );

        //get salary >45000
        emps.stream()
                .filter(emp->emp.getSalary()>45000)
                .forEach(emp-> System.out.println(emp.getName()));

        //check who has the highest salary if salary is same compare based on names which alphabet comes first
        //use thenComparing and reverse the order cause max returns the last alphabet first so use reverseOrder
        //then max returns small alphabet value first if we keep naturalOrder then max normal implementation is used
        Optional<Employee>ans=emps.stream()
                .max(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName,Comparator.reverseOrder()));
        System.out.println(ans.get().getName());

        //group by dept name as key and list of employees as value
        Map<String,List<Employee>> res=emps.stream()
                .collect(Collectors.groupingBy(s->s.getDept()));
//        System.out.println(res);
        res.forEach((key,value)->
        {
            System.out.println(key+"  "+value);
        });

        //print the count of members present in each dept
        Map<String,Long>countofDept=emps.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        System.out.println(countofDept);

       // Split the employees into two groups, salary above 50000 and the rest,
        // and print how many are in each group.
        Map<Boolean,Long> count=emps.stream()
                .collect(Collectors.partitioningBy(s->s.getSalary()>50000,Collectors.counting()));
        System.out.println(count);

        //Find the third-highest salary. Expected: 60000.
        OptionalInt cv =emps.stream()
                .map(s->s.getSalary())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .mapToInt(s->s)
                .skip(2)
                .findFirst();
        System.out.println(cv.getAsInt());



        //Question 8: Find the average salary of each department. Expected: {IT=63333.333..., HR=42500.0,
        // Finance=60000.0} (the order may differ).
       Map<String,Double> average= emps.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingInt(s->s.getSalary())));
        System.out.println(average);


//        Collectors.sum
        //find the sum of salary for each department
        Map<String,Integer> sum= emps.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.summingInt(s->s.getSalary())));
        System.out.println(sum);


        Map<String,Optional<Employee>> highestSalaryByDept=
                emps.stream()
                        .collect(Collectors.groupingBy(Employee::getDept,
                                Collectors.maxBy((s,k)->s.getSalary()-k.getSalary())));
        System.out.println(highestSalaryByDept);


        Map<String, Employee> top = emps.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                Optional::get)));
        System.out.println(top);


        //group employees by department as a List of string
        Map<String,List<String>> employeeInEachDept=
                emps.stream()
                        .collect(Collectors.groupingBy(Employee::getDept,
                                Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(employeeInEachDept);


        //group employees by department as a String
        Map<String,String> employeeInEachDepartmentInOne=
                emps.stream()
                        .collect(Collectors.groupingBy(Employee::getDept,
                                Collectors.mapping(Employee::getName,Collectors.joining(" "))));
        System.out.println(employeeInEachDept);
        System.out.println(employeeInEachDepartmentInOne);

    }

}
class Employee {
    String name;
    String dept;

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    int salary;
    // constructor, getters
    public Employee(String name,String dept,int salary)
    {
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public String getDept()
    {
        return dept;
    }
}
