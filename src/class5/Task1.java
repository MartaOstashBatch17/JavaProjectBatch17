package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month.
        Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.next();
        if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            System.out.println("You were born in spring");
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born in summer");
        } else if (month.equalsIgnoreCase("Oct") || month.equalsIgnoreCase("Nov")) {
            System.out.println("You were born in fall");
        } else if (month.equalsIgnoreCase("Dec") || month.equalsIgnoreCase("Jan") || month.equalsIgnoreCase("Feb")) {
            System.out.println("You were born in winter");

        } else {
            System.out.println("Invalid month");
        }
    }
}