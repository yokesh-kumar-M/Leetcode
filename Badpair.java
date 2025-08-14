public class Badpair {
    static int countBadPairs(int[] nums) {
        int l = nums.length;
        int count = 0;
        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(i<j){
                    if(j-i != nums[j] - nums[i]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr1 = {4,1,3,3};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(countBadPairs(arr1));
        // dummy commit 1
        // dummy commit 2
        // dummy commit 3 
    }

}
