package class8;

public class SumOfEachRowIn2DArray {
    public static void main(String[] args)
    {
        int[][] array = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        for (int i = 0; i < array.length; i++) {
            int sum = 0;


            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }


            System.out.println(sum);
        }
    }

}
