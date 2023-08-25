package review5;

public class TwoDArray {
    public static void main(String[] args) {
                              //[row][col]
        int[][] array = new int[2][4];
        //first row
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        //second row
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[1][3]=4;

        //System.out.println(array[0][3]);

        //how to get  all elements from 2d array

        //outer loop iterates through rows
        //inner loop iterates through col
        //array.length in 2d array returns number of rows
        //array[row].length returns # of col from that row

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.println(array[row][col]);

            }


        }

    }
}
