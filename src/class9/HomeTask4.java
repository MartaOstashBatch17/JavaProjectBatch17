package class9;

public class HomeTask4 {
    /*
Create 2D array of countries: north america countries,
south america countries, europe countries, asian countries,
african countries. Then print all values from that array using 2
different loops and calculate how many total countries been stored.
*/
    public static void main(String[] args) {
        String[][] countries = {
                {"Usa", "Canada", "Mexico", "Cuba"},
                {"Venezuela", "Chile", "Argentina", "Brazil"},
                {"Ukraine", "Poland", "Germany", "Italy"},
                {"Thailand", "Japan", "South Korea", "China"},
                {"Egypt", "South Africa", "Zimbabwe", "Morocco"}};
        int sum = 0;


        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                sum++;

            }
            System.out.println();
        }
        System.out.println(sum);
        System.out.println("=========================================================");

        int total=0;

        for (String[]count:countries){
            for (String c:count){
                System.out.print(c+" ");
                total++;
            }

            System.out.println();
        }
        System.out.println(total);
    }
}
