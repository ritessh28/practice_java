package Enum;
interface Discountable
{
    double applyDiscount(double price);
}
enum CustomerType implements Discountable
{
    REGULAR(0.20),
    PREMIUM(0.10),
    VIP(0.00);
    public double applyDiscount(double price)
    {
        return price-(price*discount);
    }// one method implementation for all objects but with different values
//    REGULAR(0.0)
//            {
//                public double applyDiscount(double price)
//                {
//                    CustomerType c=CustomerType.REGULAR;
//                   return price-(price*c.discount);
//                }
//            },
//    PREMIUM(0.10)
//            {
//                public double applyDiscount(double price)
//                {
//                    return price-(price* CustomerType.PREMIUM.discount);
//                }
//            },
//    VIP(0.20)
//            {
//                public double applyDiscount(double price)
//                {
//                    return price-(price* CustomerType.VIP.discount);
//                }
//            };IN CASE OF PRIVATE FIELD
    private  final double discount;
    CustomerType(double discount)
    {
        this.discount=discount;
    }

}
public class EnumInterface {
    public static void main(String[] args) {
        CustomerType c1=CustomerType.PREMIUM;
//        System.out.println(c1.applyDiscount(20000.00));
        for(CustomerType c:CustomerType.values())
        {
            System.out.println(c.applyDiscount(20000.0));
        }
    }
}
