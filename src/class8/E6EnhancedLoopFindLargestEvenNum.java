package class8;

public class E6EnhancedLoopFindLargestEvenNum {
    public static void main(String[] args) {
        /*
        Find the largest even num
         */
        int[] nums = {100, 77, 25, 56, 60, 20};

        int largest = nums[3];//you have to make sure you're initialising it with even number from the array

        for (int d : nums) {
            if (d > largest && d % 2 == 0) {
                largest = d;
            }
        }
        System.out.println(largest);


    }
}
