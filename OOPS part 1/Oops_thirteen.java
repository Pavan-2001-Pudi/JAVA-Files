/*13. Introduce multiple constructors in Product class. */

public class Oops_thirteen {
    public class Product {
        private int prodId;
        private String prodName;
        private double price;
        private int quantityOnHand;
    
        // Constructor with all parameters
        public Product(int prodId, String prodName, double price, int quantityOnHand) {
            this.prodId = prodId;
            this.prodName = prodName;
            this.price = price;
            this.quantityOnHand = quantityOnHand;
        }
    
        // Constructor with prodId, prodName, and price (default quantity is 0)
        public Product(int prodId, String prodName, double price) {
            this(prodId, prodName, price, 0);
        }
    
        // Constructor with prodId and prodName (default price and quantity)
        public Product(int prodId, String prodName) {
            this(prodId, prodName, 0.0, 0);
        }
    
        // Default constructor
        public Product() {
            this(0, "Default Product", 0.0, 0);
        }
    
        // Method to calculate net price after adding 12% tax
        public double getNetPrice() {
            return price + (price * 0.12); // Adding 12% tax
        }
    
        // Method to purchase products
        public void purchase(int quantity) {
            if (quantity > 0) {
                quantityOnHand += quantity;
                System.out.println(quantity + " units purchased. Total quantity on hand: " + quantityOnHand);
            } else {
                System.out.println("Invalid quantity. Please enter a positive number.");
            }
        }
    
        // Method to sell products
        public void sell(int quantity) {
            if (quantity > 0 && quantity <= quantityOnHand) {
                quantityOnHand -= quantity;
                System.out.println(quantity + " units sold. Total quantity on hand: " + quantityOnHand);
            } else {
                System.out.println("Invalid quantity or insufficient stock to sell.");
            }
        }
    
        // Getters for product details
        public int getProdId() {
            return prodId;
        }
    
        public String getProdName() {
            return prodName;
        }
    
        public double getPrice() {
            return price;
        }
    
        public int getQuantityOnHand() {
            return quantityOnHand;
        }
    }
    
}
