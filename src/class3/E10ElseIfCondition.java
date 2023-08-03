package class3;

public class E10ElseIfCondition {
    public static void main(String[] args) {
        String fruit = "Lechee";
        if (fruit.equals("Mango")) {
            System.out.println("Price is $5");
        }else if (fruit.equals("Orange")){
            System.out.println("Price is $1");
        }else if(fruit.equals("Banana")){
            System.out.println("Price is $3");
        }else if(fruit.equals("Apple")){
            System.out.println("Price is $45");
        }else {
            System.out.println("This Fruit is not available at our store");
        }


    }
}
