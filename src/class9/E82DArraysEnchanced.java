package class9;

public class E82DArraysEnchanced {
    public static void main(String[] args) {

        String[][] names =
                {{"Hind", "Mykola", "Ismael", "Ahmed" },
                        {"John", "Bob", "Adam", "Tamim" },
                        {"Joke", "Laugh", "John Ahmed", "Mohammad" },
                        {"Gui", "Backend", "Front", "API" }

                };
        for (String[] row:names){
            for (String n:row){
                System.out.print(n+" ");
            }
            System.out.println();

        }
       // System.out.println(Arrays.deepToString(names)); will print big arrays without the loop


            }
        }






