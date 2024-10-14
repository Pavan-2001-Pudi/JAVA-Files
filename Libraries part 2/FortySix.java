/*46.Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt and the 
  string must be one/more alphabets followed by one/more digits.(use Regular Expressions) */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FortySix {
    // Regular expression for validating the format: alphabets followed by digits
    private static final String REGEX = "^[a-zA-Z]+\\d+$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validStrings = new ArrayList<>();

        System.out.println("Enter strings (type 'end' to finish):");

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            // Check if the input matches the regex
            if (Pattern.matches(REGEX, input)) {
                validStrings.add(input);
            } else {
                System.out.println("Invalid format. Please enter a string with letters followed by digits.");
            }
        }

        // Sort the valid strings
        Collections.sort(validStrings);

        // Write the sorted strings to Codes.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Codes.txt"))) {
            for (String str : validStrings) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("Sorted strings written to Codes.txt.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}
