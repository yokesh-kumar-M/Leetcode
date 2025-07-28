import java.nio.channels.Pipe.SourceChannel;

public class Splitarray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;

        int ans = splitArraySum(arr, k);
        System.out.println(ans);
    }
    static int splitArraySum(int[] arr, int k){
        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum+num > mid){
                    sum = num;
                    pieces++;
                } else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            } else{
                end = mid;
            }
        }
        return end;
    }
}
