package class3;

public class E1TypeCasting {
    public static void main(String[] args) {
        //byte-->short-->int-->long-->float-->double
        long age=12;


       // int myAge=age; //we're trying to save huge long in small int that's why we have error; EXPLICIT, narrowing, manual casting


        byte number=10;
        int number2=number;//no error, cause we're storing smaller number rin bigger box IMPLICIT/widening type casting/auto casting


        float number1=15.6f;
        int num2;
        //num2=number1; !!!we're getting an error, cause float is bigger and we're trying to save it in smaller int;
        //thought we can do it by MANUALLY downcasting:
        num2=(int)number1; //downcasting happened, but we will lose decimal part
        System.out.println(num2); //the output will be 15!!!!












    }
}
