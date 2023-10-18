package Jonathan_Task;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 8, 9, 8, 9, 9, 9, 9, 8, 9, 9};
        int frequent = arr[0];
        int value = 0;
        for (int number = 0; number < arr.length; number++) {
            int count = 0;
            for (int element = 0; element < arr.length; element++) {
                if (arr[number] == arr[element]) {
                    count++;
                }
            }
            if (count > frequent){
                frequent = count;
                value = arr[number];
            }
        }
        System.out.println(value);
    }
}
