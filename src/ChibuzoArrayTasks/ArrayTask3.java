package ChibuzoArrayTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTask3 {

    public static void main(String[] args) {
        ArrayTask3 run = new ArrayTask3();
        run.removeOddNumbers();
    }

    public void removeOddNumbers(){
        int[] array = {22, 41, 15, 8, 2, 1};
        for (int element = 0; element < array.length; element+=2) {
            int[] newArray = new int[0];
            if (element % 2 != 0) {
                newArray = new int[array[element]];
                System.arraycopy(array, 0, newArray, 0, array[element]);
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
