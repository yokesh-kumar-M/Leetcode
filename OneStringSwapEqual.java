// 1790. Check if One String Swap Can Make Strings Equal
public class OneStringSwapEqual {
    static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }

        int firstDiff = -1;
        int secondDiff = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstDiff == -1) {
                    firstDiff = i;
                } else if (secondDiff == -1) {
                    secondDiff = i;
                } else {
                    return false;
                }
            }
        }

        return secondDiff != -1
                && s1.charAt(firstDiff) == s2.charAt(secondDiff)
                && s1.charAt(secondDiff) == s2.charAt(firstDiff);
    }

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("blank", "klanb"));
        System.out.println(areAlmostEqual("defend", "attack"));
        System.out.println(areAlmostEqual("kelb", "kelb"));
        System.out.println(areAlmostEqual("abc", "acb"));
    }
}
