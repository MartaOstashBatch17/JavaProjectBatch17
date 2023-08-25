package class9;

public class E42DTaskEvenNumbers {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40}, //row0
                {15, 30, 35, 45},//row1
                {16, 20, 32, 22}//row2
        };

        for (int row = 0; row < numbers.length; row++) {//<number of rows that is 3
            for (int column = 0; column < numbers[row].length; column++) {
                if (numbers[row][column] % 2 == 0) {
                    System.out.print(numbers[row][column] + " ");
                }
            }
            System.out.println();

        }

    }
}
