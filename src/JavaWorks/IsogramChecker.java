package JavaWorks;

public class IsogramChecker {
    public static boolean containsAllAlphabetLetters(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean[] alphabetPresent = new boolean[26];

        for (char ch : str.toCharArray()) {
            int index = ch - 'a';
            alphabetPresent[index] = true;
        }

        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";

        boolean result = containsAllAlphabetLetters(input);

        if (result) {
            System.out.println("'" + input + "' contains all the alphabet letters.");
        } else {
            System.out.println("'" + input + "' does not contain all the alphabet letters.");
        }
    }
}
