/*33. Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line. */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThirtyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String fileName = "names.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter names (type 'END' to finish):");

            while (true) {
                input = scanner.nextLine();

                if ("END".equalsIgnoreCase(input)) {
                    break; // Exit the loop if user enters 'END'
                }

                writer.write(input);
                writer.newLine(); // Write each name on a new line
            }

            System.out.println("Names have been written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to free up resources
        }
    }
}
