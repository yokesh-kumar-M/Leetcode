import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// 1. Two Sum
public class TwoSum {
    private static final Logger LOGGER = Logger.getLogger(TwoSum.class.getName());

    private TwoSum() {
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        LOGGER.info(() -> String.valueOf(Arrays.toString(twoSum(nums, 9))));
    }
}
