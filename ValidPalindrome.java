// 125. Valid Palindrome
import java.util.logging.Logger;

public class ValidPalindrome {
    private static final Logger LOGGER = Logger.getLogger(ValidPalindrome.class.getName());

    private ValidPalindrome() {
    }

    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(isPalindrome("A man, a plan, a canal: Panama")));
        LOGGER.info(() -> String.valueOf(isPalindrome("Malayalam")));
        LOGGER.info(() -> String.valueOf(isPalindrome("race a car")));
    }
}
