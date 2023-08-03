package class4;

public class Task1 {
    public static void main(String[] args) {
        boolean diploma = false;
        int GPA = 4;

        if (diploma == true) {
            System.out.println("Congratulations!");
            if (GPA >= 3.5) {
                System.out.println("Y0u are eligible for scolarship");
            } else {
                System.out.println("You should have studied harder");

            }
        } else {
            System.out.println("you should get a degree");
        }
    }
}
