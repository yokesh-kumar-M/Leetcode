// 3232. Find if Digit Game Can Be Won
import java.util.logging.Logger;

public class DigitGame {
    private static final Logger LOGGER = Logger.getLogger(DigitGame.class.getName());

    private DigitGame() {
    }

    static boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }
        return singleDigitSum != doubleDigitSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 10};
        LOGGER.info(() -> String.valueOf(canAliceWin(nums)));
    }
}
