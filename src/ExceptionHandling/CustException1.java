package ExceptionHandling;

import java.util.Scanner;

class CheckAge extends RuntimeException
{
    public CheckAge(String msg)
    {
        super(msg);
    }
}
class HasAdhar extends RuntimeException
{
    public HasAdhar(String msg)
    {
        super(msg);
    }
}
class AmountPaid extends RuntimeException
{
    public AmountPaid(String msg)
    {
        super(msg);
    }
}
class Applicant
{
    Scanner sc = new Scanner(System.in);
    int age;
    int totalAmt=2000;
    Boolean adharcard;
    double amt;
    void input()
    {
        System.out.println("Please enter your age:");
        age=sc.nextInt();
        System.out.println("Do you have Adhar Card:");
        adharcard=sc.nextBoolean();
        System.out.println("How Much Amount you have paid:");
        amt=sc.nextDouble();
    }
    void verify()
    {
        if(age<18)
        {
            throw new CheckAge("wait you are still young");
        }
        else if(amt<totalAmt)
        {
            throw new AmountPaid("pay full amount for passport verification");
        }
        else if(!adharcard)
        {
            throw new HasAdhar("cannot proceed for passport without adhar card");
        }
        else
        {
            System.out.println("congrats You are Eligible to apply for passport");
        }
    }

}
class Passport
{
    Applicant ap=new Applicant();
    void initiate()
    {
        ap.input();
        try
        {
            ap.verify();
        }
        catch(HasAdhar|CheckAge|AmountPaid e)
        {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
public class CustException1 {
    public static void main(String[] args)
    {
        Passport p=new Passport();
        p.initiate();
    }
}
