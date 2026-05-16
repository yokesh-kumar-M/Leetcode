import java.util.Arrays;

// 14. Longest Common Prefix
public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
