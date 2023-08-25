package class9;

public class HomeTask1 {
    /*
    Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits,
dairy and sweets. Retrieve all values from that array using 2 different loops

*/
    public static void main(String[] args) {
        String[][] list = {
                {"potato", "cucumber", "pepper", "corn"},
                {"banana", "mango", "starwberry", "melon"},
                {"cheese", "milk", "yogurt", "cream"},
                {"peanut butter", "candies", "chockolate", "sugar"}};

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("========================================================");


        for (String[]l:list){
            for (String col:l){
                System.out.print(col+" ");

            }
            System.out.println();

}}}