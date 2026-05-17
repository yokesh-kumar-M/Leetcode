// 258. Add Digits
import java.util.logging.Logger;

public class AddDigits {
    private static final Logger LOGGER = Logger.getLogger(AddDigits.class.getName());

    private AddDigits() {
    }

    static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(addDigits(38)));
    }
}
