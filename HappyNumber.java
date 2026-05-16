import java.util.HashSet;
import java.util.Set;

// 202. Happy Number
public class HappyNumber {
    static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (!seen.add(n)) {
                return false;
            }
            n = squareDigitSum(n);
        }
        return true;
    }

    static int squareDigitSum(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result += digit * digit;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
