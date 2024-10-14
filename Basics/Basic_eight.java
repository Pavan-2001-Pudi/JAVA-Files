
/*8. Write a program to create an array of 5 elements and store values into it by
  taking them from the keyboard and display them in reverse order*/

import java.util.Scanner;

public class Basic_eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

}
