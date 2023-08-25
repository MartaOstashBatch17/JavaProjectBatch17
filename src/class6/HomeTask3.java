package class6;

public class HomeTask3 {
    /*

Print even numbers from 20 to 1 (using 2 different loops)
     */
    public static void main(String[] args) {
        for (int i = 20; i > 1; i -= 2) {
            System.out.print(i + " ");

        }
        System.out.println();

        int x = 20;
        do {
            System.out.print(x + " ");
            x -= 2;
        } while (x > 1);


    }
}