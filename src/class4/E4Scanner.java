package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        //it's a class that contains the object nd will allow us to take inout
        Scanner input=new Scanner(System.in);
        //calling an input from the user and storing it in a name variable that is String
        String name=input.next();

        
        System.out.println("Hello "+name);
//        if(name.equals("Marta")){
//            System.out.println("Tech Student");
//        }else{
//            System.out.println("I don't know you");
//        }
        System.out.println("How old are you?");
        int age=input.nextInt();
        System.out.println("You're "+age+ " years old");







    }}
