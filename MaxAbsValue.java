// 1131. Maximum of Absolute Value Expression
import java.util.logging.Logger;

public class MaxAbsValue {
    private static final Logger LOGGER = Logger.getLogger(MaxAbsValue.class.getName());

    private MaxAbsValue() {
    }

    static int maxAbsValExpr(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = Math.abs(arr1[i] - arr1[j])
                        + Math.abs(arr2[i] - arr2[j])
                        + Math.abs(i - j);
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, -4, 5};
        int[] arr2 = {3, -1, -6, 0};
        LOGGER.info(() -> String.valueOf(maxAbsValExpr(arr1, arr2)));
    }
}
