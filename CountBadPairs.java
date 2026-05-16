import java.util.HashMap;
import java.util.Map;

// 2364. Count Number of Bad Pairs
public class CountBadPairs {
    static long countBadPairs(int[] nums) {
        Map<Integer, Long> diffCount = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - i;
            long seen = diffCount.getOrDefault(diff, 0L);
            goodPairs += seen;
            diffCount.put(diff, seen + 1);
        }

        long total = (long) nums.length * (nums.length - 1) / 2;
        return total - goodPairs;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 3};
        System.out.println(countBadPairs(arr));
    }
}
