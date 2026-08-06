package Oops.Encapsu;
class Calculator
{
    private int n1,n2;
    void setNumbers(int n1,int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    int add()
    {
        return n1+n2;
    }
    int sub()
    {
        return n1-n2;
    }
    int mul()
    {
        return n1*n2;
    }
}
public class Encapsulation3 {
    public static void main(String[] args) {
        int a=10,b=20;
        Calculator c=new Calculator();
        c.setNumbers(a,b);
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
    }
}
