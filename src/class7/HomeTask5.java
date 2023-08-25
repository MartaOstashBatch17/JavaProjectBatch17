package class7;

public class HomeTask5 {
    /*
Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
     */
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Leo", "Elephant", "Giraffe"};
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + " ");

        }
        System.out.println();
        //another way to print out the values
        for (String animal : animals)
            System.out.print(animal + " ");

    }
}
