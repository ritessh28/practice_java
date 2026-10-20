package Java8.MethodReference;

import java.util.function.Function;

public class ArbitraryReference2 {
    public static void main(String[] args) {
        Function<Person1,String>name=Person1::getNameUpper;
        System.out.println(name.apply(new Person1("shankar")));
        Function<Person1,Integer>length=Person1::getLengthOfName;
        System.out.println(length.apply(new Person1("ritesh shetty")));

    }
}
class Person1
{
    String name;
    public Person1(String name)
    {
        this.name=name;
    }
    public String getNameUpper()
    {
        return name.toUpperCase();
    }
    public int getLengthOfName()
    {
        return name.length();
    }
}
//here we are creating our own custom class person with 2 methods one for returning uppercase form of name and second
//returns length of name  as in arbitrary reference it treats first argument we pass as object type to call  specific
//method of object so getNameUpper or Length method is present in person class so we are providing first argument as
//person type so it treats it as person object and call method of that class