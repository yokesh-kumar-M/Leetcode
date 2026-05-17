// 162. Find Peak Element
import java.util.logging.Logger;

public class PeakElement {
    private static final Logger LOGGER = Logger.getLogger(PeakElement.class.getName());

    private PeakElement() {
    }

    static int findPeakElement(int[] arr) {
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
        int[] arr = {1, 2, 3, 1};
        LOGGER.info(() -> String.valueOf(findPeakElement(arr)));
    }
}
