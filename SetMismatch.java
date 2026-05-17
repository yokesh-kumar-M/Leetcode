import java.util.Arrays;
import java.util.logging.Logger;

// 645. Set Mismatch
public class SetMismatch {
    private static final Logger LOGGER = Logger.getLogger(SetMismatch.class.getName());

    private SetMismatch() {
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        LOGGER.info(() -> String.valueOf(Arrays.toString(findErrorNums(arr))));
    }
}
