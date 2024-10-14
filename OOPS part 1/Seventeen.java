/*17. Create classes to store details for two different types of Products,
   a) ImportedProducts which have import duty.
   b) DiscountedProducts which have a discount rate.
All products have name and base_price.Create required Constructors and following methods: 
print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate() also experiment with upcasting and downcasting. */

public class Seventeen {
    public static void main(String[] args) {
        // Upcasting: Child object to Parent reference
        Product importedProduct = new ImportedProduct("Laptop", 1000, 10);
        Product discountedProduct = new DiscountedProduct("Phone", 500, 20);
        importedProduct.print(); // Calls ImportedProduct's print() method
        discountedProduct.print(); // Calls DiscountedProduct's print() method
        // Downcasting: Parent reference to Child object
        if (importedProduct instanceof ImportedProduct) {
            ImportedProduct impProd = (ImportedProduct) importedProduct;
            impProd.setImportDuty(15); // Using child-specific method
            impProd.print(); // Reprinting after setting new duty
        }
        if (discountedProduct instanceof DiscountedProduct) {
            DiscountedProduct discProd = (DiscountedProduct) discountedProduct;
            discProd.setDiscountRate(25); // Using child-specific method
            discProd.print(); // Reprinting after setting new discount rate
        }
    }
}

// Base class Product
class Product {
    protected String name;
    protected double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public void setPrice(double price) {
        this.basePrice = price;
    }

    public double getNetPrice() {
        return basePrice;
    }

    public void print() {
        System.out.println("Product: " + name + ", Base Price: $" + basePrice);
    }
}

// Derived class ImportedProduct with import duty
class ImportedProduct extends Product {
    private double importDuty;

    public ImportedProduct(String name, double basePrice, double importDuty) {
        super(name, basePrice);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    @Override
    public double getNetPrice() {
        return basePrice + (basePrice * importDuty / 100);
    }

    @Override
    public void print() {
        System.out.println("Imported Product: " + name + ", Base Price: $" + basePrice +
                ", Import Duty: " + importDuty + "%, Net Price: $" + getNetPrice());
    }
}

// Derived class DiscountedProduct with discount rate
class DiscountedProduct extends Product {
    private double discountRate;

    public DiscountedProduct(String name, double basePrice, double discountRate) {
        super(name, basePrice);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getNetPrice() {
        return basePrice - (basePrice * discountRate / 100);
    }

    @Override
    public void print() {
        System.out.println("Discounted Product: " + name + ", Base Price: $" + basePrice +
                ", Discount Rate: " + discountRate + "%, Net Price: $" + getNetPrice());
    }
}
