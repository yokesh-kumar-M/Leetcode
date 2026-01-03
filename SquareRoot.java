// 69. Square Root of a Number.
public class SquareRoot {
    public static void main(String[] args) {
        int n = 2147395600;  // 46340

        System.out.println(mySqrt(n));
    }
    static int mySqrt(int n){
        
        if(n < 2) return n;

        int low = 1, high = n;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(mid <= n/mid){
                ans = mid;
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
