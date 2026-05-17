import java.util.Arrays;
import java.util.logging.Logger;

// 1480. Running Sum of 1d Array
public class RunningSum {
    private static final Logger LOGGER = Logger.getLogger(RunningSum.class.getName());

    private RunningSum() {
    }

    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        LOGGER.info(() -> String.valueOf(Arrays.toString(runningSum(nums))));
    }
}
