class Stringswap {
    static boolean areAlmostEqual(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();

        if (s1.equals(s2)) {
            return true;
        }
        if (l1 != l2) {
            return false; 
        }
        int mismatchCount = 0;
        char[] firstMismatch = new char[2];
        char[] secondMismatch = new char[2];

        for (int i = 0; i < l1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mismatchCount++;
                if (mismatchCount > 2) return false; 
                if (mismatchCount == 1) {
                    firstMismatch[0] = s1.charAt(i);
                    firstMismatch[1] = s2.charAt(i);
                } else {
                    secondMismatch[0] = s1.charAt(i);
                    secondMismatch[1] = s2.charAt(i);
                }
            }
        }

        return mismatchCount == 2 && 
               firstMismatch[0] == secondMismatch[1] && 
               firstMismatch[1] == secondMismatch[0];
    }

    public static void main(String args[]){
        
        System.out.println(areAlmostEqual("blank", "klanb"));
        System.out.println(areAlmostEqual("defend", "attack")); 
        System.out.println(areAlmostEqual("kelb", "kelb")); 
        System.out.println(areAlmostEqual("abc", "acb")); 
    }
}
