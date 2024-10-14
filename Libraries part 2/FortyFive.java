/*45.Write a program to accept a file and replace one (or) more spaces with a single space. */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FortyFive {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java SpaceReducer <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Replace multiple spaces with a single space
                String modifiedLine = line.replaceAll("\\s+", " ");
                writer.write(modifiedLine.trim());
                writer.newLine();
            }
            System.out.println("Spaces replaced and written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
