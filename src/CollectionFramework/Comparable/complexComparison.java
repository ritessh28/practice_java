package CollectionFramework.Comparable;
import java.util.*;

public class complexComparison {
    public static void main(String[] args) {
        Student1 s1=new Student1(20,"ram",90);
        List<Student1> list =new ArrayList<>();
        list.add(s1);
        list.add(new Student1(21,"aditya",90));
        list.add(new Student1(22,"shyam",90));
        list.add(new Student1(23,"atharva",100));
        Collections.sort(list);
        for(Student1 s:list)
        {
            System.out.println("marks : "+s.marks+"name : "+s.name);
        }
    }

}
class Student1 implements Comparable<Student1> {
    int age;
    String name;
    int marks;

    public Student1(int age, String name, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 other) {
        if (this.marks != other.marks)
            return this.marks - other.marks;
        return this.name.compareTo(other.name);
    }
    //enhanced version of compare to  if two student have same marks return the student with low lexicographical value
}