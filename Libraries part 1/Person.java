/*24. Go to the previous classes and override equals(), toString(), hashCode(). */

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // Check for reference equality
        if (obj == null || getClass() != obj.getClass())
            return false; // Null or different class
        Person person = (Person) obj; // Cast to Person
        return age == person.age && name.equals(person.name); // Check fields
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        int result = name.hashCode(); // Use name's hash code
        result = 31 * result + age; // Combine with age
        return result;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}'; // String representation
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        // Test equals()
        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false

        // Test hashCode()
        System.out.println(person1.hashCode() == person2.hashCode()); // true

        // Test toString()
        System.out.println(person1); // Person{name='Alice', age=30}
    }
}
