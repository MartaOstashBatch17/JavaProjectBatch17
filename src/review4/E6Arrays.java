package review4;

public class E6Arrays {
    public static void main(String[] args) {
        int[] salaries = {120000, 150000, 200000};
        System.out.println(salaries[1]);
        salaries[1] = 160000; //we're updating the value
        System.out.println(salaries[1]);
        salaries[3]=145000;
//        System.out.println(salaries[3]); //once we create array we can't resize it
    }
}
