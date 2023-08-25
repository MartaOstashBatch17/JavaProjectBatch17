package class10;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your user name");
        String username=scan.nextLine();
        System.out.println("Please enter your password");
        String password=scan.nextLine();
        System.out.println("Please confirm the password");
        String confirmedPassword=scan.nextLine();

        if (username.isEmpty()||password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");

        } else if (password.contains(username)) {
            System.out.println("Password cannot contain username");

        } else if (!password.equals(confirmedPassword)) {
            System.out.println("Passwords do not match");

        }else {
            System.out.println("Your username and password has been created");
        }


    }
}
