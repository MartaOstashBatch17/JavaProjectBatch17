package review5;

public class LoopsRecap {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");

        }
        System.out.println("Nested loop");

        for (int i = 1; i < 3; i++) {
            System.out.println("Hello");

            for (int j = 1; j <= 4; j++) {
                System.out.println("Bye");

            }

        }
        System.out.println("Nested loop2");

        for (int i = 1; i < 3; i++) {
            System.out.println("Hello");

            for (int j = 1; j <= 4; j++) {
                System.out.println("Bye");


            }
            break;
        }
        System.out.println("Nested loop3");

        for (int i = 1; i < 3; i++) {
            System.out.println("Hello");

            for (int j = 1; j <= 4; j++) {
                System.out.println("Bye");
                break;


            }

    }}}