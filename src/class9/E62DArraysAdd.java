package class9;

public class E62DArraysAdd {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {
           // System.out.println(numbers[0][row]);//numbers.length=3, 10,20,30 will be printed
            System.out.println(numbers[row][1]);// 20,30,20 cause col is 1(2nd), row < numbers.length - vertically

            //first[] controls rows, 2nd []- columns, if you want to print vertically make columns steady and rows flex

            
        }
       

    }
}
