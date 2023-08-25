package class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        if (number >= 1 && number <= 10) {
            System.out.println("Small");
        } else if (number >= 11 && number <= 100) {
            System.out.println("Medium");
        } else if (number >= 101 && number <= 1000) {
            System.out.println("Large");
        } else {
            System.out.println("Invalid number");
        }
    }
}