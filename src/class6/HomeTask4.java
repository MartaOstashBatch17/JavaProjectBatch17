package class6;

public class HomeTask4 {
    /*


Print odd numbers between 20 and 50 (using 2 different loops)

     */
    public static void main(String[] args) {
        for (int i = 21; i < 50; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println();


        int x = 21;
        do {
            System.out.print(x + " ");

            x += 2;
        } while (x < 50);
    }
}
