package class7;

public class HomeTask7 {
    /*
From an array of integer elements find the largest number.
     */
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        int largestNum=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largestNum) {
                largestNum = nums[i];

            }}     System.out.println(largestNum);



    }
}
