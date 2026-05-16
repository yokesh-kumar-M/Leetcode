// 1524. Number of Sub-arrays With Odd Sum
public class SubarraysWithOddSum {
    private static final int MOD = 1_000_000_007;

    static int numOfSubarrays(int[] arr) {
        long oddCount = 0;
        long evenCount = 1;
        long prefixSum = 0;
        long result = 0;

        for (int num : arr) {
            prefixSum += num;
            if (prefixSum % 2 == 0) {
                result = (result + oddCount) % MOD;
                evenCount++;
            } else {
                result = (result + evenCount) % MOD;
                oddCount++;
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(numOfSubarrays(arr));
    }
}
