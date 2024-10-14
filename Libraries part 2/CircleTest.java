/*41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, 
  and also use treeset for the same for circle objects and see what happens. */

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Circle implements Comparable<Circle> {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Circle))
            return false;
        Circle other = (Circle) obj;
        return Double.compare(other.x, x) == 0 &&
                Double.compare(other.y, y) == 0 &&
                Double.compare(other.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }

    @Override
    public int compareTo(Circle other) {
        int compareRadius = Double.compare(this.radius, other.radius);
        if (compareRadius != 0) {
            return compareRadius;
        }
        return Double.compare(this.x, other.x);
    }

    @Override
    public String toString() {
        return "Circle{x=" + x + ", y=" + y + ", radius=" + radius + "}";
    }
}

public class CircleTest {
    public static void main(String[] args) {
        // Creating a HashSet and adding Circle objects
        HashSet<Circle> circleHashSet = new HashSet<>();
        circleHashSet.add(new Circle(1, 2, 3));
        circleHashSet.add(new Circle(1, 2, 3)); // Duplicate
        circleHashSet.add(new Circle(2, 3, 4));

        System.out.println("HashSet contents:");
        for (Circle circle : circleHashSet) {
            System.out.println(circle);
        }

        // Creating a TreeSet and adding Circle objects
        TreeSet<Circle> circleTreeSet = new TreeSet<>();
        circleTreeSet.add(new Circle(1, 2, 3));
        circleTreeSet.add(new Circle(1, 2, 3)); // Duplicate
        circleTreeSet.add(new Circle(2, 3, 4));

        System.out.println("\nTreeSet contents:");
        for (Circle circle : circleTreeSet) {
            System.out.println(circle);
        }
    }
}
