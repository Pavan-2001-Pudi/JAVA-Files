
/*28. Design classes that need to sort a collection of Product objects either by product name or by price. */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
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
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
    }

    public static Comparator<Product> byPrice() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        };
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
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Smartphone", 499.99));
        products.add(new Product("Tablet", 299.99));

        System.out.println("Original list:");
        products.forEach(System.out::println);

        ProductSorter.sortByName(products);
        System.out.println("\nSorted by name:");
        products.forEach(System.out::println);

        ProductSorter.sortByPrice(products);
        System.out.println("\nSorted by price:");
        products.forEach(System.out::println);
    }
}
