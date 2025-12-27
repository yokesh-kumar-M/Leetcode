// 2108. Find the Palindrome String in the Array.
public class PalindromeStringArray{
    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};

        System.out.println(firstPalindrome(words));
    }
    static String firstPalindrome(String[] words){
        for(String S : words){
            if(palindromeCheck(S)){
                return S;
            }
        }
        return "";
    }
    static boolean palindromeCheck(String word){
        int left = 0;
        int right = word.length() - 1;

        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}