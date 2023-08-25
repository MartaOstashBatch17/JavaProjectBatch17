package review3;

import java.util.Scanner;

public class E3SwitchStatement {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please, enter teh name of the fruit");
        String fruit=scan.nextLine();

        switch (fruit){
            case "orange":
                System.out.println("It is usually orange");
                break;
            case "banana":
                System.out.println("It is usually yellow");
                break;
            case "strawberry":
                System.out.println("It is usually red");
                break;
            case "mango":
                System.out.println("It is usually honey");
                break;
            case "blue berry":
                System.out.println("It is usually dark blue");
                break;
            default:
                System.out.println("I don't know this fruit");

        }

    }
}
