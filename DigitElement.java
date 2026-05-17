// 2535. Difference Between Element Sum and Digit Sum of an Array
import java.util.logging.Logger;

public class DigitElement {
    private static final Logger LOGGER = Logger.getLogger(DigitElement.class.getName());

    private DigitElement() {
    }

    static int differenceOfSum(int[] arr) {
        int elementSum = 0;
        int digitSum = 0;

        for (int num : arr) {
            elementSum += num;

            int temp = num;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }
        }
        return elementSum - digitSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 15, 6, 3};
        LOGGER.info(() -> String.valueOf(differenceOfSum(arr)));
    }
}
