public class BinarySearch {
    static int search(int[] nums, int target){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            } else if(mid < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }
    // dummy commit 1
    // dummy commit 2
    // dummy commit 3
    // dummy commit 4
    // dummy commit 5
}
