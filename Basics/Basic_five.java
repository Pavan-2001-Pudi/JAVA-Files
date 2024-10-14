// 5. Write a program to accept five numbers from the user and display the average of numbers.
import java.util.Scanner;
public class Basic_five {
    public static void main(String[] args) {
        System.out.println("Enter array elements:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }

        System.out.println("The average of the given array elements is: " + sum / 5);
      
    }  
}
