package review2;

import java.util.Scanner;

public class E8CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Full name");
        String fName=scan.next(); /////not next Line, the output skips next input, this method treats 'enter' as an input
        System.out.println("City");
        scan.nextLine();//will add line if in line 9 we use next()only;
        String city= scan.nextLine();
        System.out.println(fName+" "+city);




    }
}

