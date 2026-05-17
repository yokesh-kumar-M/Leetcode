// 2108. Find First Palindromic String in the Array
import java.util.logging.Logger;

public class FirstPalindromeInArray {
    private static final Logger LOGGER = Logger.getLogger(FirstPalindromeInArray.class.getName());

    private FirstPalindromeInArray() {
    }

    static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        LOGGER.info(() -> String.valueOf(firstPalindrome(words)));
    }
}
