package class5;

import java.util.Scanner;

public class HomeTask4 {
    /*
    HW:  Using scanner class create calculator.
    Allow user to enter 2 numbers and operator(+,-,*,/).
    Based on operator provide the result to user.
Please complete this assignment in 2 ways:
using if statement and switch case.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        System.out.println("Please enter an operator");
        char operator = scan.next().charAt(0);
        switch (operator) {
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
        }


        System.out.println("Please enter number 1");
        int number1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int number2 = scan.nextInt();
        System.out.println("Please enter an operator");
        char operator1 = scan.next().charAt(0);
        if (operator1 == '*') {
            System.out.println(number1 * number2);
        } else if (operator1 == '/') {
            System.out.println(number1 / number2);

        } else if (operator1 == '+') {
            System.out.println(number1 + number2);


        } else if (operator1 == '-') {
            System.out.println(number1 - number2);

        }

    }
}
