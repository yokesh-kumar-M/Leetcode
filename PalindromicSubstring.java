// 647. Palindromic Substrings
import java.util.logging.Logger;

public class PalindromicSubstring {
    private static final Logger LOGGER = Logger.getLogger(PalindromicSubstring.class.getName());

    private PalindromicSubstring() {
    }

    static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandAroundCenter(s, i, i);
            count += expandAroundCenter(s, i, i + 1);
        }
        return count;
    }

    static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(countSubstrings("aaa")));
    }
}
