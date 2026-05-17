// 1295. Find Numbers with Even Number of Digits
import java.util.logging.Logger;

public class FindNumbersWithEvenDigits {
    private static final Logger LOGGER = Logger.getLogger(FindNumbersWithEvenDigits.class.getName());

    private FindNumbersWithEvenDigits() {
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits(int num) {
        int digits = (int) Math.log10(num) + 1;
        return digits % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        LOGGER.info(() -> String.valueOf(findNumbers(nums)));
    }
}
