package class4;

import java.util.Scanner;

public class HomeTask3 {
    /*
    Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease, enter your city");
        String city=scan.nextLine();
        System.out.println("Please, enter current temperature in that city using Fahrenheit ");
        double tempInFahrenheit= scan.nextDouble();
        double tempInCelcium=(tempInFahrenheit-32)*5/9;
        System.out.println("The temperature in Celcium in "+city+" is "+tempInCelcium);




    }
}
