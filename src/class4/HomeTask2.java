package class4;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        /*
        You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("You are eligible to obtain a driver licence");
        }else{
            System.out.println("You can obtain learners permit");
        }
    }
}
