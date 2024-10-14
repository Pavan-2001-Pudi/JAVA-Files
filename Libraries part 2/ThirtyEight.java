/*38.Write a program to accept a file and convert its contents to uppercase.(write in compact way) */

import java.io.*;

public class ThirtyEight {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java UppercaseConverter <inputFile> <outputFile>");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
                BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("Conversion to uppercase completed.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
