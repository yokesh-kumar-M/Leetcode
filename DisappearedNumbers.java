import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// 448. Find All Numbers Disappeared in an Array
public class DisappearedNumbers {
    private static final Logger LOGGER = Logger.getLogger(DisappearedNumbers.class.getName());

    private DisappearedNumbers() {
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
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
                result.add(index + 1);
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
        LOGGER.info(() -> String.valueOf(findDisappearedNumbers(arr)));
    }
}
