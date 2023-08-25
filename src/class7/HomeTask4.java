package class7;

public class HomeTask4 {
    /*
Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
     */
    public static void main(String[] args) {
        String[] cars = {"BMW", "Mercedes", "Toyota", "Tesla", "Opel", "KIA"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();
        //another loop to print it out
        for (String car : cars) {
            System.out.print(car + " ");

        }
    }
}
