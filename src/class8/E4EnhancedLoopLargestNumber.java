package class8;

public class E4EnhancedLoopLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {2, -23, -25, -56, -45, -20};
        int largest=numbers[0]; //we have to assign it to any of the values in the array indexes not straight  to 0,like  int largest=0, in case of negative numbers 0 will be the biggest, that's why we can't do 0 here
        for (int num:numbers){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);



    }
}
