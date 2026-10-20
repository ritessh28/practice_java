package CollectionFramework.Comparator;

import java.util.*;

public class PersonClass {
    public static void main(String[] args) {
        List<Person> person=new ArrayList<>();
        person.add(new Person(20,"ritesh",5.6,64.0));
        person.add(new Person(21,"rahul",6.1,70.0));
        person.add(new Person(22,"samarth",5.4,68.0));
        person.add(new Person(20,"akash",6.6,80.0));
        person.sort(new AgeComparator());
        System.out.println("after age comparison");
        System.out.println(person);

        person.sort(new NameComparator());
        System.out.println("after name comparison");
        System.out.println(person);

        person.sort(new HeightComparator());
        System.out.println("after height comparison");
        System.out.println(person);

        person.sort(new WeightComparator());
        System.out.println("after weight comparison");
        System.out.println(person);
    }
}
class Person
{
    final int age;
    final String name;
    final Double height,weight;
    public Person(int age,String name,Double height,Double weight)
    {
        this.age=age;
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;

    }
    public String getName()
    {
        return name;
    }

}
class AgeComparator implements Comparator<Person>
{
    @Override
    public int compare(Person p1,Person p2)
    {
        return Integer.compare(p1.age,p2.age);
    }
}
class NameComparator implements Comparator<Person>
{
    @Override
    public int compare(Person p1,Person p2)
    {
        return p1.name.compareTo(p2.name);
    }

}
class HeightComparator implements Comparator<Person>
{
    public int compare(Person p1,Person p2)
    {
        return Double.compare(p1.height,p2.height);
    }
}
class WeightComparator implements Comparator<Person>
{
    public int compare(Person p1,Person p2)
    {
        return Double.compare(p1.weight,p2.weight);
    }
}