// 852. Peak Index in a Mountain Array
import java.util.logging.Logger;

public class PeakIndexInMountainArray {
    private static final Logger LOGGER = Logger.getLogger(PeakIndexInMountainArray.class.getName());

    private PeakIndexInMountainArray() {
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {0, 10, 5, 2};
        LOGGER.info(() -> String.valueOf(peakIndexInMountainArray(nums)));
    }
}
