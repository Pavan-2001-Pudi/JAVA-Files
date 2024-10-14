
/*21. Write a program to accept a string that contains marks separated by commas and display total. */
import java.util.Scanner;

public class Twentyone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks seperated by commas:");
        String input = scanner.nextLine();
        String[] marksArray = input.split(",");
        int total = 0;
        for (String mark : marksArray) {
            try {
                total += Integer.parseInt(mark.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid mark: " + mark.trim());
            }
        }
        System.out.println("Total marks: " + total);
        scanner.close();
    }
}
