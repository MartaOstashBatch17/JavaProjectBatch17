package class3;

public class E2TypeCasting {
    public static void main(String[] args) {
        //byte-->short-->int-->long-->float-->double

        float box1=15.0F; //even if it's 15.0 float is bigger than int and we need to do downcasting

        int box2;

        box2=(int)box1;
        System.out.println(box2);




    }
}
