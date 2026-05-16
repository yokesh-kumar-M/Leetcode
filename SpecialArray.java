// 3151. Special Array I
public class SpecialArray {
    static boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] + nums[i]) % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4};
        System.out.println(isArraySpecial(arr));
    }
}
