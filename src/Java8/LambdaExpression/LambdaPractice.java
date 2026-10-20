package Java8.LambdaExpression;

public class LambdaPractice {
    public static void main(String[] args) {
        //if it accepts 2 arguments adding bracket is mandatory
        //if it returns in a single line writing return statement is not mandatory
        //we can directly specify the expression we want to return
        //just as the sum below
        //id does not require new keyword cause we are not defining a class while creating it
        // we are just telling how the method should be implemented as lambda expression is only eligible to functional interface
        //as it contains only one method which need to be implemented
        //we directly provide the implementation as it know it has only one method
        //so it is used as implementation for that method
        //to support functional programming
        //it should be stored in a reference type of interface we are providing implementation for to call method
        Add sum=(a,b)->a+b;
        System.out.println(sum.add(2,3));
        PrintSomething pi=()-> System.out.println("hi how are you");
        pi.printSomething();

        //if a lambda expression has multiple statements it should be written in a pair of curly braces
        //and if it is returning something in multiple statements return statement is mandatory
        Greatest great=( a,b)->
        {
            int max;
            if(a>b)
            {
                max=a;
            }
            else
                max=b;

            return max;
        };
        //if it accepts only one argument then round bracket is also not mandatory we can ignore it
        System.out.println(great.greatest(2,3));
        Add10 ten=a->a+10;
        System.out.println(ten.add10(20));
    }
}
@FunctionalInterface
interface Add
{
    int add(int a,int b);
}
interface PrintSomething
{
    void printSomething();
}
interface Greatest
{
    int greatest(int a,int b);
}
interface Add10
{
    int add10(int a);
}
//difference between lambda expression and anonymous class
//1.in lambda we don't use new keyword and in anonymous class we use new keyword
//2.types for lambda expression
//3.