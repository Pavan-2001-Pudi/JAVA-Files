/*40.Write a program to assume names1.txt & names2.txt where we have one name for line & display unique names from both the 
  files in the order they appear. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Forty {
    public static void main(String[] args) {
        String[] filenames = { "names1.txt", "names2.txt" };
        Set<String> uniqueNames = new LinkedHashSet<>();

        // Read names from both files
        for (String filename : filenames) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    uniqueNames.add(line.trim()); // Add names to the set
                }
            } catch (IOException e) {
                System.err.println("Error reading the file " + filename + ": " + e.getMessage());
                return;
            }
        }

        // Display unique names in the order they appeared
        System.out.println("Unique names from both files in order:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
