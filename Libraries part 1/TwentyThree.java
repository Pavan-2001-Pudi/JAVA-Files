/*23.Write a program to take a String and invert the case of characters. */

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");

        String input = sc.nextLine();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch))

            {
                str.append(Character.toLowerCase(ch));

            }

            else if (Character.isLowerCase(ch)) {
                str.append(Character.toUpperCase(ch));
            }

            else {
                str.append(ch);
            }

        }

        System.out.println("Inverted String is: " + str.toString());
        sc.close();

    }

}
