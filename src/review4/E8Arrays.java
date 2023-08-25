package review4;

import java.util.Arrays;
import java.util.Scanner;

public class E8Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please , enter the size of an array");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please, enter the number");
            numbers[i] = scanner.nextInt();

        }
        System.out.println("You entered there numbers");
        System.out.println(Arrays.toString(numbers));
        ;




    }
}
