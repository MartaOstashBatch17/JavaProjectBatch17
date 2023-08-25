package class9;

import java.util.Arrays;

public class E32DArraysLoops {
    public static void main(String[] args) {
//        int []row0={10,20,30,40};
//        int []row1={100,200,300,400};
//        int []row2={1,2,3,4};


       int[][] numbers ={
               {10,20,30,40}, //row0
               {100,200,303},//row1
               {1,2,3,4}//row2
       };

        int [] row=numbers[0];//returns complete 1d array with toString method
        int num=numbers[0][1];//returns us one single number
        System.out.println(Arrays.toString(row));//numbers[0]
        System.out.println(num);

    }
}
