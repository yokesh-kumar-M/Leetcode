public class Runsum1d {
    static void runningSum(int[] nums) {
        int l = nums.length;
        int[] arr = new int[l];
        for(int i=0; i<l; i++){
            int sum = 0;
            for(int j=0; j<=i; j++){
                sum += nums[j];
            }
            System.out.println(sum);
            arr[i] = sum;
        }
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        runningSum(arr);
    }
}
