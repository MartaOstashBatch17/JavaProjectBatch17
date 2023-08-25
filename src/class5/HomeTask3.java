package class5;

import java.util.Scanner;

public class HomeTask3 {
    /*
    Ask user to enter their country and capture it.
    Once values are captured print which language user speaks.

     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the country you're from");
        String country= input.nextLine();
        switch(country){

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

        }
    }
}