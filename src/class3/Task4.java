package class3;

public class Task4 {

    /*
    Create a Java program that stores the expected temperature
     and the actual temperature for a day.
     If the expected temperature is higher than the actual temperature,
     print "It's cooler than expected, wear a jacket!",
     otherwise print "It's as warm as expected, enjoy your day!"
     */

    public static void main(String[] args) {
        double expTemp=25.4;
        double actualTemp=29.9;

        if(expTemp>actualTemp){
            System.out.println("It's cooler than expected, wear a jacket!");

        }else{
            System.out.println("It's as warm as expected, enjoy your day!");
        }

    }
}
