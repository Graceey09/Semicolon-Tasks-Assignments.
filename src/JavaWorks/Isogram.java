package JavaWorks;

import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
        public static boolean isIsogram(String str) {
            // Remove spaces and convert the string to lowercase for a case-insensitive check
            str = str.replaceAll("\\s+", "").toLowerCase();

            Set<Character> characterSet = new HashSet<>();

            for (char ch : str.toCharArray()) {
                if (characterSet.contains(ch)) {
                    return false; // Character is repeated, not an isogram
                }
                characterSet.add(ch);
            }

            return true; // No repeated characters found, it's an isogram
        }

        public static void main(String[] args) {
            String input = "The quick brown fox jumps over lazy dog"; // Change this string to check other inputs

            boolean result = isIsogram(input);

            if (result) {
                System.out.println("'" + input + "' is an isogram.");
            } else {
                System.out.println("'" + input + "' is not an isogram.");
            }
        }
    }

