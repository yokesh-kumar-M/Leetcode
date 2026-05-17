import java.util.Arrays;
import java.util.logging.Logger;

// 66. Plus One
public class PlusOne {
    private static final Logger LOGGER = Logger.getLogger(PlusOne.class.getName());

    private PlusOne() {
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        LOGGER.info(() -> String.valueOf(Arrays.toString(plusOne(digits))));
    }
}
