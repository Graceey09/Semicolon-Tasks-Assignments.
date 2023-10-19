package Jonathan_Task;

import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) {
        MovingZeros run = new MovingZeros();
        int[] number = run.moveZeros();
        System.out.println(Arrays.toString(number));

    }

    public int[] moveZeros() {
        int[] number = {4, 3, 0, 2, 0, 4, 10, 12};
        for (int index = 0; index < number.length; index++)
            for (int num = index + 1; num < number.length; num++)
                if (number[index] == 0) {
                    int temp = number[num];
                    number[num] = number[index];
                    number[index] = temp;
                }
        return number;
    }
}
