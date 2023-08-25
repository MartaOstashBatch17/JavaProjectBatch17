package class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the country you're from");
        String country = scan.nextLine();
        country=country.toLowerCase();//converts to lower case


        switch (country) {
            case "ukraine":
                System.out.println("Ukrainian");
                break;

            case "usa":
                System.out.println("English");
                break;

            case "japan":
                System.out.println("Japanese");
                break;

            case"poland":
                System.out.println("Polish");
                break;

            case"china":
                System.out.println("Chinese");
                break;

            default:
                System.out.println("Language was not recognizes");

        }
    }
}