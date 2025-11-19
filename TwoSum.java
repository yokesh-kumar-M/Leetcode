import java.io.*;
import java.util.*;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            
            if (map.containsKey(other)) {
                return new int[]{i, map.get(other)};
            }
            
            map.put(nums[i], i);
        }
        
        return new int[]{}; 
    }
    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums,target));
       // dummy commit 1
    }
} 