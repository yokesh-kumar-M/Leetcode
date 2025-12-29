public class FindDuplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-duplicate-number/submissions/1780171530/
        int[] arr = {3,1,3,4,2};
        int result = findDuplicate(arr);
        System.out.println(result);
    }
    // Cyclic Sort
    static int findDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                return arr[index];
            }
        }
        return arr[i];
    }
/**
    public int findDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i+1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                } else{
                    return arr[i];
                }
            } else{
                i++;
            }
        }
        return -1;
    }
*/
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    // dummy commit 1
    // dummy commit 2
    // dummy commit 3
    // dummy commit 4

    
}
