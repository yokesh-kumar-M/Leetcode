public class MaxAscArray {
    static void maxAscendingArray(int[] nums){
        int l = nums.length;
        int result = nums[0];
        int current = nums[0];
        
        for(int i=1; i<l; i++){
            if(nums[i-1] < nums[i]){
                current += nums[i];
                System.out.println("Pass case: "+current);
            } else{
                current = nums[i];
                System.out.println("Fail case: "+current);
            }
            result = Math.max(result, current);
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        int[] arr1 = {10,20,30,5,10,50};
        int[] arr2 = {10,20,30,40,50};
        int[] arr3 = {100,10,1};
        //System.out.println(maxAscendingArray(arr1));
        maxAscendingArray(arr1);
    }
}
