import java.util.*;

public class FindAllDuplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1780360986/
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
    // cyclic Sort
    static List<Integer> findDuplicates(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;       
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        // dummy commit 1
        // dummy commit 2
        // dummy commit 3
        // dummy commit 4
        // dummy commit 5
       // dummy commit 6
       // dummy commit 7
       // dummy commit 8
       // dummy commit 9
    }
}
