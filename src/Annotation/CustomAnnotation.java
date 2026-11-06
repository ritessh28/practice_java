package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

public class CustomAnnotation {
    public static void main(String[] args) {
        Messi m=new Messi("messi","barcelona",40);
        Class cv=m.getClass();
        Annotation an=cv.getAnnotation(Football.class);
        System.out.println(an.hashCode());
//        Messi messi=(Messi) an;
//        System.out.println("details fetched from messi class itself with reflection:");
//        System.out.println("age :"+messi.age);
//        System.out.println("name :"+messi.name);
        System.out.println("details fetched from annotation at runtime  with reflection:");
        Football f=(Football)an;
        System.out.println("goals are :"+f.goals());
        System.out.println("no of matches played :"+f.noOfMatches());



    }
}

//@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD})
@Target({ElementType.TYPE,})
@Retention(RetentionPolicy.RUNTIME)
@interface Football
{
    int noOfMatches() default 10;
    int goals() default 1200;
}

@Football
class Messi
{
    String name;
    String city;
    int age;
    public Messi(String name,String city,int age)
    {
        this.name=name;
        this.city=city;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }
//
    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
//in target if we need to apply annotation for multiple elements class constructors and variables it can be done using
//({element.type,et,et})
//@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD})
//we can even fetch the values present in annotation using reflection Api
//first we need to get the class using getClass Method after that in Class there is a method called getAnnotation which
//returns a object of type Annotation that should be stored in Annotation type
//and the Annotation type object should be downcasted to Cricket Player object so we can get our fields in our example
//age and country
