public class SmallestLetterGreaterthanTarget {
    public static void main(String[] args) { 
        // https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1711359936/
        char[] letter = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letter, target));
    }

    static char nextGreatestLetter(char[] letters, char target){
        // Using binary search for finding the element greater than the target
        // Algorithm Time complexity = O(log(N))
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}