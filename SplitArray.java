// 410. Split Array Largest Sum
public class SplitArray {
    static int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;

        for (int num : arr) {
            start = Math.max(start, num);
            end += num;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        System.out.println(splitArray(arr, 2));
    }
}
