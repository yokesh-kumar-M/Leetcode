// 709. To Lower Case
import java.util.logging.Logger;

public class ToLowerCase {
    private static final Logger LOGGER = Logger.getLogger(ToLowerCase.class.getName());

    private ToLowerCase() {
    }

    static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(toLowerCase("Hello")));
    }
}
