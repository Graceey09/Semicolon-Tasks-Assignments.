package JavaWorks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySwapTest {

    @Test
    public void functionCanTakeInParametersTest(){
        ArraySwap arraySwap = new ArraySwap();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 3, 2, 4, 5};
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, arraySwap.swapIndex(1, 2, array));
    }
}
