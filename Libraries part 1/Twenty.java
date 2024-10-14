
/*20.Write a program to accept a string from the user and display it vertically. use nextLine() to read a string 
  from the user. */
import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String:");
        String inputString = scanner.nextLine();
        System.out.println("String displayed vertically:");
        for (char character : inputString.toCharArray()) {
            System.out.println(character);
        }
        scanner.close();
    }
}
