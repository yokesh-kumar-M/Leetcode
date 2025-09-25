public class MissingPositive {
    public static void main(String[] args) {
        // https://leetcode.com/problems/first-missing-positive/submissions/1782308555/
        int[] arr = {3,4,-1,1};
        int result = firstMissingPositive(arr);
        System.out.println(result);
    }
    // Cyclic Sort
    static int firstMissingPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
