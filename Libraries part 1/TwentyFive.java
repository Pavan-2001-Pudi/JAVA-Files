
/*25.Write a program to accept names until the END is given and display all the names separated by '-'. */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String input;

        System.out.println("Enter names (type 'END' to finish):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("END")) {
                break;
            }
            names.add(input);
        }
        scanner.close();
        String result = String.join("-", names);
        System.out.println("Names entered: " + result);
    }
}
