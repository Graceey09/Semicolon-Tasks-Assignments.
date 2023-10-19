package Jonathan_Task;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String result = String.valueOf(checkIsAnagram("chair", "chair"));
        System.out.println(result);
    }

    public static boolean checkIsAnagram(String word1, String word2) {
        char[] words = word1.toCharArray();
        char[] letters = word2.toCharArray();
        char[] finalWord = sort(words);
        char[] finalWord2 = sort(letters);
        boolean isAnagram = false;
        if(Arrays.equals(finalWord, finalWord2))
            isAnagram = true;
        return isAnagram;
    }

    public static char[] sort(char[] word) {
        char temp;
        for (int ind = 0; ind < word.length; ind++)
            for (int elm = ind; elm < word.length; elm++)
                if (word[ind] > word[elm]) {
                    temp = word[elm];
                    word[elm] = word[ind];
                    word[ind] = temp;
                }
        return word;
    }
}
