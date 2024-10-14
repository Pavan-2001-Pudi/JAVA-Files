//12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
//Methods are:   init(prod_id,prod_name, price)
//getNetPrice() (returns the price after adding 12% tax)
//purchase()
//sell()

import java.util.Scanner;

public class Product {
    private int prodId;
    private String prodName;
    private double price;
    private int quantityOnHand;

    public Product(int prodId, String prodName, double price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantityOnHand = 0;
    }

    public double getNetPrice() {
        final double taxRate = 0.12;
        return price * (1 + taxRate);
    }

    public void purchase(int quantity) {
        if (quantity > 0) {
            quantityOnHand += quantity;
            System.out
                    .println("Purchased " + quantity + " of " + prodName + ". New quantity on hand: " + quantityOnHand);
        } else {
            System.out.println("Quantity must be greater than zero.");
        }
    }

    public void sell(int quantity) {
        if (quantity > 0) {
            if (quantity <= quantityOnHand) {
                quantityOnHand -= quantity;
                System.out.println("Sold " + quantity + " of " + prodName + ". Remaining quantity: " + quantityOnHand);
            } else {
                System.out.println("Insufficient stock to sell.");
            }
        } else {
            System.out.println("Quantity must be greater than zero.");
        }
    }

    public static void main(String[] args) {
        Product product = new Product(1, "Widget", 100.0);
        System.out.printf("Net price of %s: $%.2f%n", product.prodName, product.getNetPrice());
        product.purchase(20);
        product.sell(4);
        product.sell(1);
    }
}
