package class10;

public class CarTester {
    public static void main(String[] args) {
        Car sedan=new Car();
        sedan.color="White";
        sedan.make="Sedan";
        sedan.price=30000;
        sedan.makeUTurn();


        Car suv=new Car();
        suv.color="Black";
        suv.make="SUV";
        suv.price=35000;
        suv.makeUTurn();
        suv.moveFurniture();


        Car sportsCar=new Car();
        sportsCar.color="Ree";
        sportsCar.make="Sports Car";
        sportsCar.price=350000;
        sportsCar.goFast();
        sportsCar.makeUTurn();

    }
}
