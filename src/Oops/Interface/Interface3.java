package Oops.Interface;
interface Payment
{
    void pay();
}
class Upi implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("payment is done through Upi");
    }
    public void upiNo(int n)
    {
        System.out.println("Upi account number is "+n);
    }
}
class DebitCard implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("payment is done through DebitCard");
    }
    public void accountNo(int n)
    {
        System.out.println("your account number is "+n);
    }
}
class NetBanking implements Payment
{
    @Override
    public void pay()
    {
        System.out.println("payment is done through NetBanking");
    }
}
public class Interface3 {
    public static void main(String[] args)
    {
        Payment p1 = new Upi();
        p1.pay();
        Upi p2=(Upi)p1;
        p2.upiNo(10);
        Payment p3 = new DebitCard();
        p3.pay();
        DebitCard p4=(DebitCard)p3;
        p4.accountNo(10);


    }
}
