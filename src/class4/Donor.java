package class4;

public class Donor {
    /*
    Create a Java program and call it a Donor.
 In order to be eligible to donate your
 blood you have to be 18 years old. Also once you identify age eligibility
 then we have to see if person matches weight requirements.
 If person weight it more than 110 lbs → then he/she is eligible,
  otherwise we cannot accept such a patient.
     */
    public static void main(String[] args) {
        int age = 9;
        double weight = 200;


        if (age > 18) {
            System.out.println("You're eligible to donor blood");

            if (weight > 110) {
                System.out.println("You match weight requirements as well");
            } else {
                System.out.println("You don't match weight requirements");
            }

        } else {
            System.out.println("You can't be a donor");
        }
    }
}