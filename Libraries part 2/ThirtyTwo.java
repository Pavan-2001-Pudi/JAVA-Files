/*32.Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.*/

import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        String input;

        System.out.println("Enter numbers to sum up positive values (enter 'O' to finish):");

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("O")) {
                break;
            }

            try {

                double number = Double.parseDouble(input);

                if (number > 0) {
                    sum += number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: '" + input + "' is not a valid number. Please try again.");
            }
        }

        System.out.println("The sum of positive numbers is: " + sum);
        scanner.close();
    }
}
