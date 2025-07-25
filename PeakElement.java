class PeakElement{
    static int findPeakElement(int[] arr){
        // using binary search for find largest elements
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-peak-element/submissions/1711145575/
        int[] arr = {1,2,3,1};
        System.out.println(findPeakElement(arr));
        // Algorithm should be O(log(N))
    }
}