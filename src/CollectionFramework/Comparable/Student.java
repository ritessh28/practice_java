package CollectionFramework.Comparable;

import java.util.*;

public class Student implements Comparable<Student> {
    int age;
    String name;
    int marks;
    public Student(int age,String name, int marks)
    {
        this.age=age;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student other)
    {
        return this.marks - other.marks;
    }
    //returns student in ascending order
    //if we want to return in descending form change the condition
    //if ascending this left side if descending right side
    //if ascending this should be negative when this.marks is smaller
    //if descending this should be negative when this.marks is greater
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(20, "ritesh", 99));
        list.add(new Student(21, "samarth", 70));
        list.add(new Student(23, "adi", 80));
        Collections.sort(list);
//        System.out.println(Arrays.toString(list)
        for(Student s:list)
        {
            System.out.println("marks: "+s.marks+" age : "+s.age+" name: "+s.name );
        }
    }
}
