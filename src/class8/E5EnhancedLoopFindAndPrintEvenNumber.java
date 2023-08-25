package class8;

public class E5EnhancedLoopFindAndPrintEvenNumber {
    public static void main(String[] args) {
        /*
        Print all the even numbers one by one from Array using enhanced for loop
         */
        int[] numbers = {10, 23, 25, 56, 45, 20};
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }


    }
}
