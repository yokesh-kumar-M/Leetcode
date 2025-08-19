import java.util.Arrays;

public class LongCommonprefix {
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int midlength = Math.min(first.length(), last.length());

        int i=0;
        while (i < midlength && first.charAt(i) == last.charAt(i)){
            i++;
        }
        return first.substring(0, i);
        
    }

    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};
        String[] strs2 = {"game", "gamer", "games", "gamed"};
        System.out.println(longestCommonPrefix(strs));
        //longestCommonPrefix(strs);
        // Dummy commit 1 -- IGNORE --
        // Dummy commit 2 -- IGNORE --
    }
}
