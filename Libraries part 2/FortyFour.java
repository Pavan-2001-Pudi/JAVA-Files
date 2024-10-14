/*44.Write a program to accept a string & display each word on a separate line (use any separator) */

import java.util.Scanner;

public class FortyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split the input string by spaces
        String[] words = input.split(" ");

        // Display each word on a separate line
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
