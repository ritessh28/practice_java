package MiniProjects;

import java.util.ArrayList;

class CreditCard implements PaymentMethod
{
    String cardNo,exp_Date;
    public CreditCard(String cardNo,String exp_Date)
    {
//        super();
        this.cardNo=cardNo;
        this.exp_Date=exp_Date;
    }
    public void processPayment(double amt)
    {
        System.out.println("Charged "+amt+" to a card Ending "+cardNo.substring(cardNo.length()-4));
    }
}
class Upi implements PaymentMethod
{
    String upiId;
    public Upi(String upiId)
    {
        this.upiId=upiId;
    }
    public void processPayment(double amt)
    {
        System.out.println("Paid "+amt+" via "+upiId);
    }
}
class Cash implements PaymentMethod
{

    public void processPayment(double amt)
    {
        System.out.println("Received "+amt+" in cash");
    }
}
public class VendingMachine {
    PaymentMethod p;
    ArrayList<Product> product;
    public VendingMachine(PaymentMethod obj,ArrayList<Product> products) {
        this.p = obj;
        this.product=products;
//        System.out.println(this.p);

    }
    public void PaymentDoneThrough(double amt)
    {
        p.processPayment(amt);
    }
    public void buy(String name,double amt)
    {
        Boolean found=false;
        for(Product pi:product)
        {
            if(name.equalsIgnoreCase(pi.name))
            {
                found=true;
                if(CheckIfStockExists(pi))
                {
                    if(checkAmount(amt,pi))
                    {
                        p.processPayment(amt);
                        pi.stock--;
                        found=true;
                        break;
                    }
                    else
                    {
                        System.out.println("amount is less please check the amount");
                    }
                }
                else
                {
                    System.out.println("product is out of stock");
                }
                break;
            }
        }
        if(!found)
        {
            System.out.println("no such product exists");
        }
    }
    public boolean CheckIfStockExists(Product product)
    {
        if(product.stock==0)
            return false;
        return true;
    }
    public boolean checkAmount(double amt,Product product)
    {
        if(amt>=product.price)
        {
            return true;
        }
        return false;
    }


}
