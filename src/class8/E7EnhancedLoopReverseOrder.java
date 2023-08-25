package class8;

public class E7EnhancedLoopReverseOrder {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 25, 56, 45, 20};
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 20) {
                numbers[i] = 0; //all the numbers>20 will be reassigned to 0

            }

            System.out.println(numbers[i]);

        }


    }
}
