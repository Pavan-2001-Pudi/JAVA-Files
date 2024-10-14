/*47.Write a program to display the file which contains the given string in a path. */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FortySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                boolean found = false;
                for (File file : files) {
                    if (file.isFile() && containsString(file, searchString)) {
                        System.out.println("File containing '" + searchString + "': " + file.getName());
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("No files contain the string '" + searchString + "'.");
                }
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }

        scanner.close();
    }

    private static boolean containsString(File file, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + file.getName() + " - " + e.getMessage());
        }
        return false;
    }
}
