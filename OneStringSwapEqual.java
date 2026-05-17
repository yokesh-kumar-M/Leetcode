// 1790. Check if One String Swap Can Make Strings Equal
import java.util.logging.Logger;

public class OneStringSwapEqual {
    private static final Logger LOGGER = Logger.getLogger(OneStringSwapEqual.class.getName());

    private OneStringSwapEqual() {
    }

    static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }

        int firstDiff = -1;
        int secondDiff = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstDiff == -1) {
                    firstDiff = i;
                } else if (secondDiff == -1) {
                    secondDiff = i;
                } else {
                    return false;
                }
            }
        }

        return secondDiff != -1
                && s1.charAt(firstDiff) == s2.charAt(secondDiff)
                && s1.charAt(secondDiff) == s2.charAt(firstDiff);
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(areAlmostEqual("blank", "klanb")));
        LOGGER.info(() -> String.valueOf(areAlmostEqual("defend", "attack")));
        LOGGER.info(() -> String.valueOf(areAlmostEqual("kelb", "kelb")));
        LOGGER.info(() -> String.valueOf(areAlmostEqual("abc", "acb")));
    }
}
