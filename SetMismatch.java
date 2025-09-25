import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        // https://leetcode.com/problems/set-mismatch/submissions/1780402166/
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNumbers(arr)));
    }
    // Cyclic Sort
    static int[] findErrorNumbers(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index + 1){
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
