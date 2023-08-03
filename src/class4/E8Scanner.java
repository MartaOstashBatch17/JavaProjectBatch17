package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        if (name.equals("Jamel")) {
            System.out.println("Senior SDET in 2 years");
        } else if (name.equals("Marta")) {
            System.out.println("Ukraine will win the war");
        } else if (name.equals("Taras")) {
            System.out.println("Best man in the world");
        } else if (name.equals("Nadiia")) {
            System.out.println("Best friend");
        }
    }
}