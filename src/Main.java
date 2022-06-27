import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price, priceWithTax, taxPrice, tax = 0.18;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Price: ");
        price = input.nextDouble();

        taxPrice = tax * price;
        priceWithTax = taxPrice + price;

        System.out.println("tax price: " + taxPrice);
        System.out.println("Price with tax: " + priceWithTax);
        System.out.println("Price without tax: " + price);
    }
}
