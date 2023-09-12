package ChibuzoArrayTasks;

import java.util.Arrays;

public class ArrayTask1 {

    public static void main(String[] args) {
        ArrayTask1 run = new ArrayTask1();
        run.arraySwap();

    }
    public void arraySwap() {

        int[] number = {4, 2, 3, 4, 9, 6};
        for (int index = 0; index < number.length - 1; index += 2) {
            int temp = number[index];
            number[index] = number[index + 1];
            number[index + 1] = temp;
        }
        System.out.println(Arrays.toString(number));
    }
//        JavaWorks.ArrayTask1 arrayTask1 = new JavaWorks.ArrayTask1();
//        arraySwap();
//        int[] number = {1, 2, 3, 4, 5, 6};
//        for (int num = 0; num < number.length; num++){
//            int temp = number[0];
//            number[0] = number[1];
//            number[1] = temp;
//            System.out.println(Arrays.toString(number));



}

