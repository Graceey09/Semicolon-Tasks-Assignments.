package JavaWorks;

import java.util.Arrays;

public class ArraySwap {

    public int[] swapIndex(int firstIndex, int secondIndex, int[] array){

            array[firstIndex] += array[secondIndex];
            array[secondIndex] = array[firstIndex] - array[secondIndex];
            array[firstIndex] = array[firstIndex] - array[secondIndex];
            return array;

        }

    }
