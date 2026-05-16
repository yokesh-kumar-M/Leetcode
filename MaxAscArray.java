// 1800. Maximum Ascending Subarray Sum
public class MaxAscArray {
    static int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                current += nums[i];
            } else {
                current = nums[i];
            }
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 10, 50};
        System.out.println(maxAscendingSum(arr));
    }
}
