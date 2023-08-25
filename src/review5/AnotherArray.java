package review5;

public class AnotherArray {
    public static void main(String[] args) {

        double[] price = {1.99, 12.09, 1, 4.50};
        //        indexes  0     1     2   3

        for (double p:price){
            System.out.print(p+" ");


        }
        System.out.println();
        for (int i = 0; i < price.length; i++) {
            System.out.print(price[i]+" ");

        }


    }
}
