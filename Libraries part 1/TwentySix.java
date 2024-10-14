/*26.Write a program to accept starting_date and ending_date in DD-MM-YYYY format and display 
 no of days between those two dates.*/

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept the starting date from the user
        System.out.print("Enter the starting date (DD-MM-YYYY): ");
        String startDate = scanner.nextLine();
        // Accept the ending date from the user
        System.out.print("Enter the ending date (DD-MM-YYYY): ");
        String endDate = scanner.nextLine();
        // Split the starting and ending dates into day, month, and year
        String[] start = startDate.split("-");
        String[] end = endDate.split("-");
        // Convert the starting date into total days
        int startDay = Integer.parseInt(start[0]);
        int startMonth = Integer.parseInt(start[1]);
        int startYear = Integer.parseInt(start[2]);
        int totalStartDays = startDay + (startMonth * 30) + (startYear * 365);
        // Convert the ending date into total days
        int endDay = Integer.parseInt(end[0]);
        int endMonth = Integer.parseInt(end[1]);
        int endYear = Integer.parseInt(end[2]);
        int totalEndDays = endDay + (endMonth * 30) + (endYear * 365);
        // Calculate the difference in days
        int daysBetween = totalEndDays - totalStartDays;
        // Display the result
        System.out.println("Number of days between the two dates: " + daysBetween);
        scanner.close();
    }
}
