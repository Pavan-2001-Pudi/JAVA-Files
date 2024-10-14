/*19.Write a program to create an array of 10 elements, fill it with random no's and display 
  array elements which are greater than average of array. */

import java.util.Random;

public class Nineteen {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + average);
        System.out.println("Elements greater than the average:");
        for (int num : numbers) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
    }
}
