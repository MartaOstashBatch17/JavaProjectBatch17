package class4;

public class E2NestedIfStatements {
    public static void main(String[] args) {

        boolean winter = true;
        String jacketColor = "black";

        if (winter == true) {
            System.out.println("It's very cold");

            if (jacketColor.equals("red")) {
                System.out.println("Let's go with red Nike shoes");
            } else {
                System.out.println("Let's go with the blue ones");
            }

        } else {
            System.out.println("No need to wear a jacket");

        }

    }
}
