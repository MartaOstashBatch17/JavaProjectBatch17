package class8;

public class E4EnhancedLoopCount {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 25, 56, 45, 20};
        int count = 0;
        for (int n : numbers) {
            if (n > 20) {
                count++;
            }
        }
        System.out.println(count);

    }
}
