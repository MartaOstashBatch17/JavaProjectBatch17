package class8;

public class Task2 {
    public static void main(String[] args) {
        //gn through the array and replace all the negative numbers with 0
        int[]nums={0,77,25,56,60,20,-5,-10};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                nums[i]=0;


        }
            System.out.println(nums[i]);

        }




    }
}
