public class PeakIndexinmountainArray {
    static int peakIndexInmountainArray(int[] arr){
        // using binary search for largest element
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        // https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1711151260/
        // Algorithm Time complexity = O(log(N))
        int[] nums = {0,10,5,2};
        System.out.println(peakIndexInmountainArray(nums));
    }
}
