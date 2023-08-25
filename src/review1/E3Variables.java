package review1;


public class E3Variables {
    public static void main(String[] args) {

        int age,price,noOfFans;
        age=15;
        price=1000;
        noOfFans=4;
        String operation1=age+" "; //STRING!!!
        String operation2=operation1+price; //SPRING as well;
        String operation3=operation2+noOfFans;//String as well!!!!
        System.out.println(age+" "+price+noOfFans);//all the time concatenation happening cause  the result of first operation was SPRING!!!!!
//that's why the output is 15 10004, the concatenation was not happening!!!!


        System.out.println(12+""+5*5);//output 1225 cause multiplication has priority


        //another way to create variables:
        int size=10,noOfCars=4, noOfTyres=4;




    }

}
