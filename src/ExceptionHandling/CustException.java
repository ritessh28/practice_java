package ExceptionHandling;

import java.util.Scanner;

class TooYoungException extends RuntimeException
{
        public TooYoungException(String msg)
        {
            super(msg);
        }
}
class TooOldException extends RuntimeException
{
    public TooOldException(String msg)
    {
        super(msg);
    }


}
public class CustException {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        try {
            if (age < 20) {

                throw new TooYoungException("wait you still have time you are too young for marriage");
            } else if (age > 60) {
                throw new TooOldException("too old for marriage rest");
            } else {
                System.out.println("you are eligible for mathcing we will resposne you soon in email");
            }
        }
        catch(TooYoungException|TooOldException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
