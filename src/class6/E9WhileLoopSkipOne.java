package class6;

public class E9WhileLoopSkipOne {
    public static void main(String[] args) {


        int i = 1;
        while (i <= 10) {
            if (i != 7) {//will help to skip 7 cause the cond is false
                System.out.println(i);
            }
            i++;
        }
    }
}