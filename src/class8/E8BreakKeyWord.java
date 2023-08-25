package class8;

public class E8BreakKeyWord {
    public static void main(String[] args) {
        //you have to search the array for 45 and if present -print
        int[] nums = {10, 23, 25, 45, 56, 20};
        for (int n : nums) {
            if (n == 45) {
                System.out.println("Found");
                break;

            }


        }

    }
}
