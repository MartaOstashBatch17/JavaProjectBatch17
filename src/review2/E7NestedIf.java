package review2;

public class E7NestedIf {


    public static void main(String[] args) {
        String day = "Saturday";
        double accountBalance = 5000;
        if (day.equals("Sunday")) { //  if(!day.equals("Sunday")){ not equal to

            if (accountBalance > 2000) {
                System.out.println("We can buy this");
            } else {
                System.out.println("It's too expensive");
            }

        } else if (day.equals("Saturday")) {
            System.out.println("it's Saturday");

        } else {
            System.out.println("I will stay home, let's wait for Sunday");
        }


    }
}
