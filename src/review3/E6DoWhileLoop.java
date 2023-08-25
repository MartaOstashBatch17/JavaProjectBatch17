package review3;

import java.util.Scanner;

public class E6DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x = 0;
        int sum=0;
        do {


            System.out.println("please, enter the price or -1 toterminate");
            x= scan.nextInt();
            if(x!=-1){
            sum=sum+x;
            }
            System.out.println("Your total bill is "+ sum);

        }while(x!=-1);




        }
    }
