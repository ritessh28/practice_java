package Oops.MethodOver;
class RulesOfMethodOverriding
{
    public static  int  add(int a,int b)
    {
        System.out.println("static method :");
        return a+b;
    }
    protected  double add(int a,int b,int c)
    {
        System.out.println("normal method:");
        return  a+b+c;
    }
    private void add(int a)
    {
        System.out.println((a+10));
    }

}
public class Rules {
    public static void main(String[] args) {
        RulesOfMethodOverriding obj =new RulesOfMethodOverriding();
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(2,4));
//        System.out.println(obj.add(2));

    }
}
//rules for method overloading
/*
1. static keyword can be used for method overloading because resolved at compile time
2. access modifier doesn't matter for mo
3. method signature matters that is same name but differ in number of arguments types of arguments or order of
   arguments
4. return type can be same or different with rule 3

 */