import java.util.Arrays;
import java.util.logging.Logger;

// 977. Squares of a Sorted Array
public class SortedSquares {
    private static final Logger LOGGER = Logger.getLogger(SortedSquares.class.getName());

    private SortedSquares() {
    }

    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if (leftSq > rightSq) {
                result[i] = leftSq;
                left++;
            } else {
                result[i] = rightSq;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        LOGGER.info(() -> String.valueOf(Arrays.toString(sortedSquares(arr))));
    }
}
