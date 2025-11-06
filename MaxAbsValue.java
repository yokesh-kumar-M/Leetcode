public class MaxAbsValue{
    static int MaxAbsExpr(int[] arr1, int[] arr2){
        int l = arr1.length;
        int temp = 0;

        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                int t = 0;
                t = Math.abs(arr1[i] - arr1[j]) + Math.abs(arr2[i] - arr2[j]) + Math.abs(i - j);
                if(temp < t){
                    temp = t;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int[] arr1 = {2,1,-4,5};
        int[] arr2 = {3,-1,-6,0};
        System.out.println(MaxAbsExpr(arr1, arr2));
      // dummy commit 1
      // dummy commit 2
      // dummy commit 3
    }
}