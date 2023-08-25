package class8;

import java.util.Scanner;

public class E10BreakKeyWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;

        while (true) { //will always be true
            System.out.println("Please, enter the price of the item or -1 to terminate");
            double price = scan.nextDouble();
            if (price == -1) {
                break;

            } else {
                total = total + price;

            }
            System.out.println("Your total bill is "+total);
        }

    }
}


