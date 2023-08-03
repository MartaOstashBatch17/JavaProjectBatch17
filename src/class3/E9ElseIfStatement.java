package class3;

public class E9ElseIfStatement {
    public static void main(String[] args) {
        /*when something can have milt outcome and for each outcome you
        want to do diffenet thing-use else if
         */

        int day = 7;
        if (day == 1) {
            System.out.println("It's Monday ;(");
        } else if (day == 2) {
            System.out.println("It's Tuesday let's no go to work");
        } else if (day == 3) {
            System.out.println("It's Wednesday");

        } else if (day == 4) {
            System.out.println("It's Thursday");

        } else if (day == 5) {
            System.out.println("It's Friday, yaaaaaaay");

        } else if (day == 6) {
            System.out.println("It's Saturday, yaaaaaaay");
        } else if (day == 7) {
            System.out.println("It's Sunday");

        } else {
            System.out.println("Wrong day");
        }


    }
}
