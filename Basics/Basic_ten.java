/*10.Write a program to create a function that takes multiple numbers and displays common factors. */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic_ten {
    public class CommonFactors {

        // Function to find common factors of multiple numbers
        public static List<Integer> findCommonFactors(int[] numbers) {
            List<Integer> commonFactors = new ArrayList<>();

            // Find the minimum number in the array
            int min = Integer.MAX_VALUE;
            for (int number : numbers) {
                if (number < min) {
                    min = number;
                }
            }

            // Check for factors from 1 to min
            for (int i = 1; i <= min; i++) {
                boolean isCommon = true;
                for (int number : numbers) {
                    if (number % i != 0) {
                        isCommon = false;
                        break;
                    }
                }
                if (isCommon) {
                    commonFactors.add(i);
                }
            }

            return commonFactors;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of integers: ");
            int count = scanner.nextInt();
            int[] numbers = new int[count];

            System.out.println("Enter the integers:");
            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextInt();
            }

            List<Integer> commonFactors = findCommonFactors(numbers);

            System.out.println("Common factors: " + commonFactors);

            scanner.close();
        }
    }

}
