package class9;

public class E92DArraysEnchancedTask {
    public static void main(String[] args) {

        String[][] cars =
                {{"Ford", "Cadillac", "Jeep", "Tesla" },
                        {"BMW", "Audi", "Mercedes", "Volkwagen" },
                        {"Kia", "Hyundai", "Sportage", "Genesis Motor" },
                        {"Ferrari", "Lamborghini", "Maserati", "Fiat" }};


        for (String []row : cars) {
            for (String c : row) {
                System.out.print(c + " ");
            }
            System.out.println();

        }

        System.out.println("=========================================");
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j <cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }


    }
}






