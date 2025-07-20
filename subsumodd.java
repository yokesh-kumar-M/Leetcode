public class subsumodd {
    static void numOfSubarrays(int[] arr){
        int l = arr.length;
        int count = 0;
        for(int i=0; i<l; i++){
            if(arr[i]%2 != 0){
                count++;
                System.out.println(arr[i]);
            }
            int sum = 0;
            if(i == l-1) break;
            for(int j=i; j<l; j++){
                sum += arr[j];
            }
            if(sum%2 != 0){
                count++;
                System.out.println(sum);
            }
        }
    }
    public static void main(String args[]){
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};
       // System.out.println(numOfSubarrays(arr1));
       numOfSubarrays(arr1);
    }
}
