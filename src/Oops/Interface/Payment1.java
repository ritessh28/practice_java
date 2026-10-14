package Oops.Interface;

import java.util.ArrayList;
import java.util.List;
abstract class PaymentMethod
{
    abstract void processPayment(double amt);
}
//interface PaymentMethod
//{
//    void processPayment(double amt);
//}
class CreditCard extends PaymentMethod
{
    String cardno,expiry;
    public CreditCard(String cardno,String expiry)
    {
        this.cardno=cardno;
        this.expiry=expiry;
    }
    public void processPayment(double amt) throws PaymentLimitExceedException
    {
        if(amt>50000)
        {
            throw new PaymentLimitExceedException("cannot process payment add less amount");
        }
        System.out.println("Charged "+amt+" to a card Ending "+cardno.substring(cardno.length()-4));
    }
    public void printReceipt(double recno)
    {
        System.out.println("receipt no is "+recno);
    }

}
class Upi1 extends PaymentMethod
{
    String upiId;
    public Upi1(String upiId)
    {
        this.upiId=upiId;
    }
    public void processPayment(double amt)
    {
        System.out.println("Paid "+amt+" via "+upiId);
    }
}
class Cash extends PaymentMethod
{
    public Cash()
    {

    }
    public void processPayment(double amt)
    {
        System.out.println("Received "+amt+" in cash");
    }

}
class PaymentLimitExceedException extends RuntimeException
{
    public PaymentLimitExceedException(String msg)
    {
        super(msg);
    }
}
public class Payment1 {
    public static void main(String[] args) {
        List<PaymentMethod>pi=new ArrayList<PaymentMethod>();
        pi.add(new CreditCard("1234567891","29-08-2027"));
        pi.add(new Upi1("rite@ffec"));
        pi.add(new Cash());
        for(PaymentMethod p:pi)
        {
            try {
                p.processPayment(500000);
            }
            catch (PaymentLimitExceedException e)
            {
                System.out.println(e.getMessage());
            }
        }
//        pi.get(0).printReceipt(20000);
        if(pi.get(0) instanceof CreditCard ch)
        {
//            CreditCard ch=(CreditCard) pi.get(0);
            ch.printReceipt(234);
//            ch.processPayment(2000);
        }



    }

}

