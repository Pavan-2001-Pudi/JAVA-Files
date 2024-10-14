
/*30. Go back to all classes and handle exceptions */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Custom exception for product-related errors
class ProductException extends Exception {
    public ProductException(String message) {
        super(message);
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) throws ProductException {
        if (name == null || name.isEmpty()) {
            throw new ProductException("Product name cannot be null or empty.");
        }
        if (price < 0) {
            throw new ProductException("Product price cannot be negative.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}

class ProductComparator {
    public static Comparator<Product> byName() {
        return Comparator.comparing(Product::getName);
    }

    public static Comparator<Product> byPrice() {
        return Comparator.comparingDouble(Product::getPrice);
    }
}

class ProductSorter {
    public static void sortByName(List<Product> products) {
        Collections.sort(products, ProductComparator.byName());
    }

    public static void sortByPrice(List<Product> products) {
        Collections.sort(products, ProductComparator.byPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Sample products creation with exception handling
        try {
            products.add(new Product("Laptop", 999.99));
            products.add(new Product("Smartphone", 499.99));
            products.add(new Product("Tablet", 299.99));
            products.add(new Product("", 100.00)); // This will throw an exception
        } catch (ProductException e) {
            System.err.println("Error adding product: " + e.getMessage());
        }

        // Display original list
        System.out.println("Original list:");
        products.forEach(System.out::println);

        // Sort and display by name
        try {
            ProductSorter.sortByName(products);
            System.out.println("\nSorted by name:");
            products.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error sorting by name: " + e.getMessage());
        }

        // Sort and display by price
        try {
            ProductSorter.sortByPrice(products);
            System.out.println("\nSorted by price:");
            products.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error sorting by price: " + e.getMessage());
        }
    }
}
