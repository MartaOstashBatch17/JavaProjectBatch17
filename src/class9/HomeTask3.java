package class9;

public class HomeTask3 {
    /*
Create a 2D array of integer type where you will store odd and even
numbers in 3 rows and 4 columns. Develop a program which will
identify/print the even numbers only.

*/
    public static void main(String[] args) {
        int [][] numbers={
                {1,2,3,4},
                {11,12,13,14},
                {50,51,33,22},
                {56,57,54,23}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }}
                System.out.println();



        }
    }
}
