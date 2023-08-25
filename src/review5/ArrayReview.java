package review5;

public class ArrayReview {
    public static void main(String[] args) {
        int a = 10;


        int[] array = {10, 11, 12, 13, 55, 34, 24};
        int numberOfElements = array.length;
        System.out.println(numberOfElements);
        System.out.println(array[3]); //getting one element

        /*
         when to use loops - when we want to repeat a block of code

         when  we do not know the exact #of iterations - while or do while

         when we know how many times we want to repeat or
         iterate  block of code   - we go for a for loop or enhanced for loop

         We use enhanced for loop ONLY with arrays or collections
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        /*
        enhanced for /advanced/for each  loop syntax:
        for(datatype varname : arrayname){}
         */
        for (int ar : array) {
            System.out.print(ar+" ");

        }

    }
}
