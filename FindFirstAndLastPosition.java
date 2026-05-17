import java.util.Arrays;
import java.util.logging.Logger;

// 34. Find First and Last Position of Element in Sorted Array
public class FindFirstAndLastPosition {
    private static final Logger LOGGER = Logger.getLogger(FindFirstAndLastPosition.class.getName());

    private FindFirstAndLastPosition() {
    }

    static int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = search(arr, target, true);
        if (result[0] != -1) {
            result[1] = search(arr, target, false);
        }
        return result;
    }

    static int search(int[] arr, int target, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        LOGGER.info(() -> String.valueOf(Arrays.toString(searchRange(nums, 8))));
    }
}
