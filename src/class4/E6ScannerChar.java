package class4;

import java.util.Scanner;

public class E6ScannerChar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender F/M");

        //we use different method for CHAR
        char gender=scanner.next().charAt(0);
        System.out.println("Your gender is "+gender);

    }
}
