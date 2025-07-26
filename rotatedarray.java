public class rotatedarray {
    public static void main(String[] args) {
        // Algorithm complexity = O(log(N))
        int[] arr = {3,5,1}; //{4,5,6,7,0,1,2};
        int target = 3;

        int result = ans(arr, target);
        System.out.println(result);
    }
    static int ans(int[] arr, int target){
        // Finding the pivot element = Largest element in an array
        int pivot = findPivot(arr);

        // if the findPivot return -1, Then array is a sorted array.
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        // if target is the pivot returning it directly 
        if(arr[pivot] == target){
            return pivot;
        }
        // When the target is larger than first element. Then it should between pivot and start.
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        // This is the else case if the target is smaller than the start. Then it will be in the second
        // half of the rotated array.
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        // Binary Search with argumented starting and ending point.
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            // When the mid > mid+1 then the pivot is mid in a rotated array.
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // If the pointer is in the second half of the array and 
            // if mid < mid - 1. Then the mid - 1 is the larger and it is the pivot element.
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }

            // if the mid smaller than start then end pointer should be within the mid.
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
