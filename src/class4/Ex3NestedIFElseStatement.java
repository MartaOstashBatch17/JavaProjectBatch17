package class4;

public class Ex3NestedIFElseStatement {
    public static void main(String[] args) {

        //we only have one var and still are able to have nested if
        double accountBalance = 30000;

        if (accountBalance > 28000) {
            System.out.println("We can afford a normal Toyota");
            if(accountBalance>50000){
                System.out.println("We can afford Luxury cars as well");
            }

        } else {
            System.out.println("We need to save more");
        }


    }
}
