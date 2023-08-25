package review2;

import java.util.Scanner;

public class E5IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age to calculate discount");
        int age = scan.nextInt();
        if (age > 60) {
            System.out.println("You will get 20% discount");

        } else if (age > 50) {
            System.out.println("You get 15%");

        } else if (age > 40) {
            System.out.println("You will get 10%");
        } else {
            System.out.println("No discounts for you");
        }
    }
}