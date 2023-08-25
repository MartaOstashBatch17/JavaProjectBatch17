package class8;

public class Task1ArraysTrueFalse {
    public static void main(String[] args) {

        boolean[] conditions = {true, false, true, false, true, true};
        int count = 0;
        for (int i = 0; i < conditions.length; i++) {


            if (conditions[i]) {   //==true
                count++;
            }
        }
        System.out.println(count);


    }

}

