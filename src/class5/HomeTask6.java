package class5;

import java.util.Scanner;

public class HomeTask6 {
    /*
    Allow user to enter grade (A, B, or C etc...) and then provide explanation:
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
At the end your program should print which grade was entered by a user with explanation.
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not acceptable");


    }

}}
