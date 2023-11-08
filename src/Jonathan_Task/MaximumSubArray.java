package Jonathan_Task;

public class MaximumSubArray {
    public static void main(String[] args) {
//        int result = maximumArray([2, 4, 6, 3, 9, 1]);

    }

    public static int maximumArray(int[] array) {
        int temp;
        int total = 0;
        for (int num = 0; num < array.length; num++) {
            for (int elm = num; elm < array.length; elm++) {
                total = array[num] + array[elm];

            }
        }
        return total;
    }
}
