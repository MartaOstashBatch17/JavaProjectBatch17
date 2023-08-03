package class3;

public class E3TypeCasting {
    public static void main(String[] args) {
        //byte-->short-->int-->long-->float-->double

        int number=426820;
        byte number2;
        number2=(byte)number;
        System.out.println(number2); //byte is small and can't hold those numbers cause results might be unexpected


        short box1=200;
        int box2=box1;
        System.out.println(box2);  //IMPLICIT smaller umber is stores to bigger box
    }
}
