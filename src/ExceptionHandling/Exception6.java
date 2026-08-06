package ExceptionHandling;
class EligibilityException extends Exception
{
    private int  age;
    public EligibilityException(String message)
    {
        super(message);
    }
    public EligibilityException(int age)
    {
        this.age = age;
    }
    public void CheckEligibility(int age)
    {
        if(age>18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }
}
//class CheckEligibility extends EligibilityException
//{
//
//    public CheckEligibility(String message) {
//        super(message);
//    }
//
//}
public class Exception6 {
    public static void main(String[] args) {
        EligibilityException ee = new EligibilityException("Eligible");

    }

}
