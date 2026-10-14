package MiniProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> pi = new ArrayList<Product>();
        pi.add(new Product("chips", 20, 3));
        pi.add(new Product("biscuit", 10, 20));
        pi.add(new Product("maggi", 30, 40));
        int mode;
        double amt;
        do {
            int i=1;
            System.out.println("vending machine menu\n" +
                    "products available are:");
            for (Product product : pi) {
                System.out.println(i+". "+product.name + " Price: " + product.price);
                i++;
            }
            System.out.println("enter the product name which you want to buy:");
            String productName = sc.nextLine();
            System.out.println("enter the amount");
            amt=sc.nextDouble();
            sc.nextLine();
            System.out.println("Which mode of Payment would you prefer\n" +
                    "1.Credit Card\n" +
                    "2.Online Payment\n" +
                    "3.cash\n" +
                    "4.exit");
            mode = sc.nextInt();
            sc.nextLine();
            switch (mode) {
                case 1:
                    System.out.println("enter credit card no:");
                    String cardNo = sc.nextLine();
                    System.out.println("enter expiry date:");
                    String exp = sc.nextLine();
                    VendingMachine vm = new VendingMachine(new CreditCard( cardNo,exp), pi);
                    vm.buy(productName,amt);
                    break;
                case 2:
                    System.out.println("enter Upi id");
                    String upiId=sc.nextLine();
                    VendingMachine vu=new VendingMachine(new Upi(upiId),pi);
                    vu.buy(productName,amt);
                    break;
                case 3:
                    VendingMachine vc=new VendingMachine(new Cash(),pi);
                    vc.buy(productName,amt);
                    break;

            }
        } while (mode != 4);
    }
}
