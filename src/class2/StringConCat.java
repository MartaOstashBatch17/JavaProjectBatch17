package class2;

public class StringConCat {
    public static void main(String[] args) {
        String msg="My age is ";
        int age=20;
        String result=msg+age;
        System.out.println(result);

        System.out.println("A string"+10+10);
        System.out.println("A string"+(10+10));
        System.out.println(2+2*2);//6
        System.out.println((2+2)*2);//8
        System.out.println("10"+10);//1010 it's conccat not sum
        System.out.println("10"+10+10);//101010
        System.out.println("10"+(10+10));//1020
        System.out.println("10"+10*10);//10100



    }
}
