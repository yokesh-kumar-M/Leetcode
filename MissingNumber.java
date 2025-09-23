public class MissingNumber {
    // Algorithm Complexity O(N)
    public static void main(String[] args) {
        // https://leetcode.com/problems/missing-number/submissions/1780131863/
        int[] arr = {4,0,2,1};
        int result = missingNumber(arr);
        System.out.println(result);
    }
    // Cyclic Sort for 1 to N elements
    static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
