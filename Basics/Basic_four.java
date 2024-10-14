
/*4. Write a program to accept the day of a week and the number of hours worked and calculate the wage 
 Conditions:
     1,2,3 —>  Rs200/ hour
        4,5  —> Rs400 / hour
           6  —> Rs600 / hour
           7  —> Rs800 / hour
      1 to 7 is Monday to Friday.
  If the total amount exceeds Rs2000 then there will be a bonus of 10%.  (Use Switch Expression)*/
import java.util.Scanner;

public class Basic_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 0;
        switch (a) {
            case 1, 2, 3:
                n = b * 200;
                break;
            case 4, 5:
                n = b * 400;
                break;
            case 6:
                n = b * 600;
                break;
            case 7:
                n = b * 800;
                break;

        }
        if (n > 2000) {
            int bonus = n * 10 / 100;
            System.out.println(n + bonus);
        } else {
            System.out.println(n);
        }

    }
}
