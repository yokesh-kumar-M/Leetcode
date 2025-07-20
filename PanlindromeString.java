class PanlindromeString{
    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^A-Za-z0-9]", "");

        char c;
        String resString = "";
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            resString = c + resString;
        }
        if(resString.equals(s)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "Malayalam";
        String s3 = "race a car";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }
}