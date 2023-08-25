package class4;

import java.util.Scanner;

public class HomeTask4 {
    /*
    Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them.
If they do have one ask what is balance on the card? If balance of the card is
larger than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more.

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Will you be using a credit card, please answer true/false");
       boolean creditCard= scan.nextBoolean();
       if (creditCard==true){
           System.out.println("Whats is your credit card balance?");
           int balance=scan.nextInt();

           if(balance>1000){
               System.out.println("You have to pay it off immediately");
           }else{
               System.out.println("You can spend more");
           }

    }else{
        System.out.println("We would like to offer you a credit card");
    }
}}

