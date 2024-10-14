/*48.Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order 
of name.(Use regular expression) */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class FortyEight {
    // Regular expression to validate name and mobile number format
    private static final String CUSTOMER_REGEX = "^[a-zA-Z\\s]+\\s+\\d{10}$";

    public static void main(String[] args) {
        List<String> customers = new ArrayList<>();

        // Read from the customers.txt file
        try (BufferedReader reader = new BufferedReader(new FileReader("customers.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                // Validate the entry with regex
                if (Pattern.matches(CUSTOMER_REGEX, line)) {
                    customers.add(line);
                } else {
                    System.out.println("Invalid entry skipped: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Sort customers by name
        Collections.sort(customers, Comparator.comparing(s -> s.split("\\s+")[0]));

        // Display sorted customers
        System.out.println("Customers sorted by name:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}
