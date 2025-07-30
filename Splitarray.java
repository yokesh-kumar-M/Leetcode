public class Splitarray {
    public static void main(String[] args) {
        // Binary search = O(log(N))
        int[] arr = {7,2,5,10,8};
        int k = 2;

        int ans = splitArraySum(arr, k);
        System.out.println(ans);
    }
    static int splitArraySum(int[] arr, int k){
        // Binary search
        int start = 0;
        int end = 0;
        
        // For defining the start and end points
        for(int i=0; i<arr.length; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                // Checking whether sum and arr[i] are exceeding mid value
                if(sum+num > mid){
                    sum = num;
                    pieces++;
                // If exceeds then fill sum with the particular arr[i] value
                } else{
                    sum += num;
                }
            }
            // If the division is greater than 2 then we point the start value to mid + 1
            if(pieces > k){
                start = mid + 1;
            // Else the mid point the assigned to the end value.
            } else{
                end = mid;
            }
        }
        return end;
    }
}
