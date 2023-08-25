package class8;

public class Task1Smallest {
    public static void main(String[] args) {
        //find the smallest number
        int[]nums={0,77,25,56,60,20,-5,-10};
        int smallest=nums[0];
        for(int n:nums){
            if(n<smallest){
                smallest=n;
            }}
            System.out.println(smallest);


    }
}
