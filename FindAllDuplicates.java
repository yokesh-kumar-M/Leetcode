import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// 442. Find All Duplicates in an Array
public class FindAllDuplicates {
    private static final Logger LOGGER = Logger.getLogger(FindAllDuplicates.class.getName());

    private FindAllDuplicates() {
    }

    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                result.add(arr[index]);
            }
        }
        return result;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        LOGGER.info(() -> String.valueOf(findDuplicates(arr)));
    }
}
