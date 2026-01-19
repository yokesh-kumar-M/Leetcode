// 647. Palindromic Substring.
public class PalindromicSubstring {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubString(s));
    }
    // O(N^2) - Time complexity for solving.
    static int countSubString(String s){

        int count = 0;
        for(int i=0; i<s.length(); i++){
            count += expandCenter(s, i, i);
            count += expandCenter(s, i, i+1);
        }
        return count;
    }
    static int expandCenter(String s, int left, int right){
        int count = 0;
        int length = s.length();

        while(left >= 0 && right < length && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
