package class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int day = 7;
        if (day >= 1 && day <= 5) {
            System.out.println("It's a weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("It's a weekend");


        } else {
            System.out.println("Invalid number");

        }
    }
}