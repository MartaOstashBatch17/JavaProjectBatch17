package class5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height");

        double height = input.nextDouble();

        if (height < 60) {
            System.out.println("short");

        } else if (height >= 60 && height <= 72) {
            System.out.println("Medium");

        } else if (height > 72) {
            System.out.println("tall");
        } else {
            System.out.println("invalid input");
        }

    }
}
