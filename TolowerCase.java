// 709.To Lower Case.
public class TolowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
    static  String toLowerCase(String s){
        StringBuilder sb = new StringBuilder(s.length());

        for(int i=0; i<s.length(); i++){
             char c = s.charAt(i);

             if(c >= 'A' && c <= 'Z'){
                c = (char)(c + 32);
             }
             sb.append(c);
        }
        return sb.toString();
    }
}
