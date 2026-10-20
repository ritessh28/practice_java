package Java8.LambdaExpression;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentType p=(String type,int amount)->
        {return type;};
        System.out.println(p.paymentType("credit card",20000));
        print("cash",100000,(String type,int amount)->
        {
            return type;
        });

    }
    public static void print(String type,int amount,PaymentType p)
    {
        System.out.println(p.paymentType(type,amount));
    }
}
interface PaymentType
{
    String paymentType(String type,int amount);
}
//in print function where we are expecting person as an argument as we know it is functional interface
// we can directly pass the implementation through lambda function