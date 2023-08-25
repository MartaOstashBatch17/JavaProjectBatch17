package class7;

public class HomeTask2 {
    /*
Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array).
     */
    public static void main(String[] args) {

        String[] names = {"Marta", "Maria", "Olena", "Julia", "Ashan", "Makeba"};
        System.out.println(names[0]);

        //another way

        String[]name=new String[6];
        name[0]="Marta";
        name[1]="Maria";
        name[2]="Olena";
        name[3]="Julia";
        name[4]="Ashan";
        name[5]="Makeba";
        System.out.println(name[0]);


    }
}