package class9;

public class E22DArraysLoops {
    public static void main(String[] args) {

        String[][] names =
                {{"Hind", "Mykola", "Ismael", "Ahmed" },
                        {"John", "Bob", "Adam", "Tamim" },
                        {"Joke", "Laugh", "John Ahmed", "Mohammad" },
                        {"Gui", "Backend", "Front", "API" }

                };

        String[] row = names[2];
//        String[] firstRow = names[0];
//        //System.out.println(row[0]);
//        System.out.println(Arrays.toString(firstRow));

        for (String name:row) { //row is 1d array
            System.out.println(name);
        }
    }
}
