import java.util.Arrays;

public class FirstandLastSearch {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1711423093/
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1, -1};

        // using function to define each Elements
        ans[0] = search(arr, target, true);
        // Reducing the search complexity. (Run-Time)
        if(ans[0] != -1){
            ans[1] = search(arr, target, false);
        }

        return ans;
    }
    static int search(int[] arr, int target, boolean findsearchIndex){
        // Using binary search to find the Occurence of Element's Index.
        // Algorithm Time complexity = O(log(N))
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                // Potential answer.
                ans = mid;
                // Checking for repitation front and back of element
                if(findsearchIndex){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
