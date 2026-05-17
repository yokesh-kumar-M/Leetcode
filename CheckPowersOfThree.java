// 1780. Check if Number is a Sum of Powers of Three
import java.util.logging.Logger;

public class CheckPowersOfThree {
    private static final Logger LOGGER = Logger.getLogger(CheckPowersOfThree.class.getName());

    private CheckPowersOfThree() {
    }

    static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(checkPowersOfThree(12)));
        LOGGER.info(() -> String.valueOf(checkPowersOfThree(91)));
        LOGGER.info(() -> String.valueOf(checkPowersOfThree(21)));
    }
}
