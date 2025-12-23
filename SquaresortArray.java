import java.util.Arrays;

public class SquaresortArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums){
        squares(nums);
        return sort(nums);
    }
    static int[] squares(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i] *= nums[i];
        }
        return nums;
    }
    static int[] sort(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length-i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}
