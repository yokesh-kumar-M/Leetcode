public class SpecialArray {
    static boolean isArraySpecial(int[] nums){
        int result = 0;
        for(int i=1; i<nums.length; i++){
            result = nums[i-1] + nums[i];
            if(result%2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        // int[] arr = {1};
        int[] arr = {2,1,4};
        // int[] arr = {4,3,1,6};

        System.out.println(isArraySpecial(arr));
    }
}
