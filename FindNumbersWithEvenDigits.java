// 1295. Find Numbers with Even Number of Digits
public class FindNumbersWithEvenDigits {
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits(int num) {
        int digits = (int) Math.log10(num) + 1;
        return digits % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
