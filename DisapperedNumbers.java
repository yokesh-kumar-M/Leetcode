import java.util.*;

public class DisapperedNumbers {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1780156905/
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisapperedNumbers(arr));
    }
    // Cyclic Sort
    static List<Integer> findDisapperedNumbers(int[] arr){
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
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
