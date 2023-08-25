package review3;

import java.util.Scanner;

public class TaskLogicalOperator {
    public static void main(String[] args) {

        /*
        Ask the user to input two boolean values (true or false).
Use the logical AND operator (&&) to determine if both are true.
Display the result to the user.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter true/false");
        boolean input1=scan.nextBoolean();
        System.out.println("Please enter true/false");
        boolean input2=scan.nextBoolean();
        System.out.println(input1&&input2);

        // another way
//        if (input1&&input2){
//            System.out.println("Both values are true");
//        }else {
//            System.out.println("Both values are NOT true");
//        }

    }
}