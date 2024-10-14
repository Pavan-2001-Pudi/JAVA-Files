
/*18.Write a program to guess the random number in three attempts. The range is (1 to 25). */
import java.util.Random;
import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1;
        int attempts = 3;
        System.out.println("Welcome to the Number Guessing game,");
        System.out.println("Guess a number between 1 and 25.You have total three attempts,");

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt" + i + ":Enter your guess :");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (i == attempts) {
                System.out.println("You have ran out of guesses. The correct number was: " + randomNumber);
            }
        }

        scanner.close();
    }
}
