package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(90,"ramesh"));
        list.add(new Student(80,"amit"));
        list.add(new Student(67,"daniel"));
        list.add(new Student(76,"john"));
        Collections.sort(list,(s1,s2)-> s1.marks-s2.marks);
        for(Student s:list)
        {
            System.out.println(s);
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareToIgnoreCase(o2.name);
            }
        });
        for(Student s:list)
        {
            System.out.println(s);
        }


    }
}
class Student
{
    int marks;
    String name;
    public Student(int marks,String name)
    {
        this.marks=marks;
        this.name=name;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}