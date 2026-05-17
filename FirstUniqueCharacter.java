// 387. First Unique Character in a String
import java.util.logging.Logger;

public class FirstUniqueCharacter {
    private static final Logger LOGGER = Logger.getLogger(FirstUniqueCharacter.class.getName());

    private FirstUniqueCharacter() {
    }

    static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(firstUniqChar("loveleetcode")));
    }
}
