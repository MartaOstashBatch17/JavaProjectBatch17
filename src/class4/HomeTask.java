package class4;

import java.util.Scanner;

public class HomeTask {
    /*
    You are a loan specialist and you need to ask user what is the amount of loan is needed.
    If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease enter the amount of loan needed");
        int loanAmount= scan.nextInt();

        if(loanAmount<=200000){
            System.out.println("We will lend you money");
        }else{
            System.out.println("Unfortunately you're rejected");
        }


    }
}
