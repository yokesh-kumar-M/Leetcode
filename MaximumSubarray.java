// 53. Maximum Subarray
import java.util.logging.Logger;

public class MaximumSubarray {
    private static final Logger LOGGER = Logger.getLogger(MaximumSubarray.class.getName());

    private MaximumSubarray() {
    }

    static int maxSubArray(int[] arr) {
        int currentMax = arr[0];
        int overallMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            overallMax = Math.max(overallMax, currentMax);
        }
        return overallMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        LOGGER.info(() -> String.valueOf(maxSubArray(arr)));
    }
}
