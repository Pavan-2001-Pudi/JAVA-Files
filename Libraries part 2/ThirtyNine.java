/*39.Write a program to take names from names.txt & display unique names in sorted order. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ThirtyNine {
    public static void main(String[] args) {
        String filename = "names.txt";
        HashSet<String> namesSet = new HashSet<>();

        // Read names from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                namesSet.add(line.trim());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Convert to a list and sort
        List<String> uniqueNames = new ArrayList<>(namesSet);
        Collections.sort(uniqueNames);

        // Display unique names in sorted order
        System.out.println("Unique names in sorted order:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
