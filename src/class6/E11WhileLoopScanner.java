package class6;

import java.util.Scanner;

public class E11WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start = scan.nextInt();
        System.out.println("Please enter the ending point");
        int end=scan.nextInt();
        System.out.println("Please enter the # of steps");
        int step=scan.nextInt();

        while (start <= end) {
            System.out.print(start+" ");
            start+=step;

        }
    }
}
