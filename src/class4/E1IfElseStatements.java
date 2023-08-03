package class4;

public class E1IfElseStatements {
    public static void main(String[] args) {
        int age = 10;
        boolean condition = true;

        if (condition) {
            System.out.println(1); //output will be true cause boolean condition is TRUE


        } else {
            System.out.println(2);

        }
        /////same example but more complex condition

        int age1 = 10;
        boolean condition1 = age > 5;

        if (condition1) {
            System.out.println(1); //output will be true cause 10>5

        } else {
            System.out.println(2);
        }

/////same example but with Strings condition boolean
        int age2 = 10;
       String name ="Marta";
       boolean condition2=name.equals("Marta");

        if (condition2) {
            System.out.println(1); //output will be true cause 10>5

        } else {
            System.out.println(2);
        }
    }
}
