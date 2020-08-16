import java.util.Scanner;

public class CalculateRestaurantBill {
    public static void main(String[] args) {
        double price1,price2,price3,tax,taxamount,ProductPrice;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Price 1");
        price1=scanner.nextDouble();
        System.out.println("Enter Price 2");
        price2=scanner.nextDouble();
        System.out.println("Enter Price 3");
        price3=scanner.nextDouble();
        System.out.println("Enter Tax");
        tax=scanner.nextDouble();
        ProductPrice=price1*price2*price3;
        taxamount=(tax/100)*ProductPrice;
        System.out.println("Total Amount ="+taxamount);

    }
}
