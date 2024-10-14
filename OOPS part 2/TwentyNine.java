/*29.Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.*/

import java.util.Scanner;

public class TwentyNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int count = 5;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number (string): ");
            String input = scanner.nextLine();
            try {
                // Try to parse the input to a double
                double number = Double.parseDouble(input);
                total += number;
            } catch (NumberFormatException e) {
                // Handle the case where the input is not a valid number
                System.out.println("Invalid input: '" + input + "' is not a valid number. Please try again.");
                i--; // Decrement the counter to ensure we get 5 valid numbers
            }
        }

        System.out.println("The total of the valid numbers is: " + total);
        scanner.close();
    }
}
