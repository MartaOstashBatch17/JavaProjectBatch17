package review2;

public class E1TypeCasting {
    public static void main(String[] args) {
        int number=(int) 10.5;//converting float 10.5 into int, but we will lose decimals

        float number2=20.100f;
        double number3=number2; // it'a auto converting, cause smaller value is stored in bigger box

        //boolean bool=(boolean)12.5; error cause not all date types can be converted

        char c=(char)65;//explicit
        System.out.println(c); //A cause it's asci table 65=A

        //String s=(String)'C'; type casting works only with primitive data types





    }
}
