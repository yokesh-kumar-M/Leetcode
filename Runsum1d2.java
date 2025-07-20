public class Runsum1d2 {
    static int[] runningSum(int[] arr){
        int l = arr.length;
        for(int i=1; i<l; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr
    }
    pubic static void main(String[] args){
        int[] arr = {1,2,3,4};
        System.out.println(runningSum(arr));
    }
}
