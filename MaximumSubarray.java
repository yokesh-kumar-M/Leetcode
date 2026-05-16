// 53. Maximum Subarray
public class MaximumSubarray {
    static int maxSubArray(int[] arr) {
        int currentMax = arr[0];
        int overallMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            overallMax = Math.max(overallMax, currentMax);
        }
        return overallMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(arr));
    }
}
