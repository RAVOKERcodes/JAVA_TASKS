package TASK;

import java.util.Scanner;

class Product {
//------------------------------------------make public DM not private 
    public int quantity;
    public double price;
    public boolean cashDiscount;
  //------------------------------------------using "this" 
    public Product(int quantity, double price, boolean cashDiscount) {
        this.quantity = quantity;
        this.price = price;
        this.cashDiscount = cashDiscount;
    }
  //------------------------------------------gross amount
    public double calculateGrossAmount() {
        return quantity * price;
    }
  //------------------------------------------discounts
    public double calculateNetAmount() {
        double grossAmount = calculateGrossAmount();
        double discount = 0.0;

        if (quantity > 10) {
            discount = 0.2 * grossAmount; // 20% quantity discount
        }

        if (cashDiscount) {
            discount += 0.05 * grossAmount; // 5% cash discount
        }

        return grossAmount - discount;
    }
}
//------------------------------------------main
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//------------------------------------------input inputs
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Product[] products = new Product[numProducts];
        double totalNetAmount = 0.0;
//------------------------------------------input loop
        for (int i = 0; i < numProducts; i++) {
            System.out.println("\nProduct " + (i + 1) + " details:");

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter price per unit: ");
            double price = scanner.nextDouble();

//------------------------------------------Vacant the newline to look good just for fun
            scanner.nextLine(); 

            System.out.print("Is cash discount available? (Y/N): ");
            String cashDiscountOption = scanner.nextLine();

            boolean cashDiscount = cashDiscountOption.equalsIgnoreCase("Y");

            products[i] = new Product(quantity, price, cashDiscount);
//------------------------------------------total amount
            double netAmount = products[i].calculateNetAmount();
            totalNetAmount += netAmount;
        }

        System.out.println("\nProduct Details:");
//------------------------------------------output loop
        for (int i = 0; i < numProducts; i++) {
            double grossAmount = products[i].calculateGrossAmount();
            double netAmount = products[i].calculateNetAmount();

            System.out.println("Quantity: " + products[i].quantity);
            System.out.println("Price per Unit: $" + products[i].price);
            System.out.println("Cash Discount: " + (products[i].cashDiscount ? "Yes" : "No"));
            System.out.println("Gross Amount: $" + grossAmount);
            System.out.println("Net Amount to Pay: $" + netAmount);
        }
//------------------------------------------final output
        System.out.println("\nTotal Net Amount for all products: $" + totalNetAmount);

//==//ye u did it dumb next time plz dont take 1 fking hr to do it(-_-)//==//
    }
}
//==//you lazy ass//==//


