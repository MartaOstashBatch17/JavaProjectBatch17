package class7;

public class HomeTask6 {
    /*
Create an array on integers and calculate the sum of all elements in an array
     */

    public static void main(String[] args) {
        int[] numbers = {10, 20, 70};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            System.out.println(sum);

        }

    }
}
