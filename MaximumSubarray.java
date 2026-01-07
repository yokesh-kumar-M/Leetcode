// 53. Maximum Subarray
public class MaximumSubarray {
    public static void main(String[] args) {
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    } 
    static int maxSubArray(int[] arr){
        int M1 = arr[0], M2 = arr[0];

        for(int i=1; i<arr.length; i++){
            M1 = Math.max(arr[i] , (M1 + arr[i]));
            M2 = Math.max(M2, M1);
        }
        return M2;
    }
    
    /**
    static int maxSubArray(int[] arr){
        int M1 = arr[0], M2 = arr[0];
        for(int i=1; i<arr.length; i++){
            M1 = MAX(arr[i], (M1+arr[i]));
            M2 = MAX(M2, M1);
        }
        return M2;
    }
    static int MAX(int n1, int n2){
        if(n1 > n2){
            return n1;
        }
        return n2;
    }
    **/
}

