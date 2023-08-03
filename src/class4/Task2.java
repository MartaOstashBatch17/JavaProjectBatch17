package class4;

public class Task2 {
    /*
    Create a Java program and store values of mortgage rate
    and mortgage price. First, program should check if rate
    is higher than 4.5 user will not buy a house, otherwise user
    will consider buying. Once user decides to buy a house,
    if price of the house is larger than 50000 than user will take a loan,
    otherwise user will pay cash.
     */
    public static void main(String[] args) {
        double mortgageRate = 4.6;
        double mortgagePrice = 40000;

        if (mortgageRate > 4.5) {
            System.out.println("User will not buy the house");

        } else {
            System.out.println("User will consider buying house");
        }
        if (mortgagePrice > 50000) {

            System.out.println("user will take a loan");
        } else {
            System.out.println("user will pay cash");
        }


    }
}
