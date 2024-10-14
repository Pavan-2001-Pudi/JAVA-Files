/*22.Write a program to accept a string and display the position of space for all spaces. */

import java.util.Scanner;

public class TwentyTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        displaySpacePositions(input);

        scanner.close();
    }

    private static void displaySpacePositions(String str) {
        StringBuilder positions = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                positions.append(i).append(" ");
            }
        }

        if (positions.length() > 0) {
            System.out.println("Positions of spaces: " + positions.toString().trim());
        } else {
            System.out.println("No spaces found in the string.");
        }
    }
}
