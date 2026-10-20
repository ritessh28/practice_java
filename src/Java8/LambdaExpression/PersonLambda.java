package Java8.LambdaExpression;

public class PersonLambda {
    public static void main(String[] args) {

        Person p=((int age,String personType)->
        {
            System.out.println(age);
            System.out.println(personType);
            return "Employee";
        });
//        p.features(20,"employee");

    }
    public static void printPerson(int age,String personType)
    {
        System.out.println(age);
        System.out.println(personType);
    }
}
@FunctionalInterface
interface Person
{
   String features(int age,String PersonType);
}

//class Employee implements Person {
//    int age;
//    String personType;
//    @Override
//    public void   features(int age, String personType)
//    {
//        this.age=age;
//        this.personType=personType;
//    }
//}