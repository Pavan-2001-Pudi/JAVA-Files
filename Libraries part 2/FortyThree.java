/*43.Write a program to accept pan no and check whether it is valid or not. */

import java.util.Scanner;
import java.util.regex.Pattern;

public class FortyThree {
    // Regular expression for validating PAN
    private static final String PAN_REGEX = "[A-Z]{5}[0-9]{4}[A-Z]";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PAN Number: ");
        String pan = scanner.nextLine().trim();

        if (isValidPan(pan)) {
            System.out.println("PAN is valid.");
        } else {
            System.out.println("PAN is invalid.");
        }

        scanner.close();
    }

    private static boolean isValidPan(String pan) {
        // Check if the PAN matches the regex pattern
        return Pattern.matches(PAN_REGEX, pan);
    }
}
