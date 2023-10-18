package Jonathan_Task;

public class KissAndDry {
    public static void main(String[] args) {
        kissDry("kissdry");
    }

    public static void kissDry(String word) {
        int[] array = new int[]{6, 2, 3, 4, 1, 0, 5};

        for (int index = 0; index < word.length(); index++) {
            for (int num = 0; num < array.length; num++)
                if (array[index] == num)
                    System.out.println(word.charAt(num));
        }

    }
}
