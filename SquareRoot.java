// 69. Sqrt(x)
import java.util.logging.Logger;

public class SquareRoot {
    private static final Logger LOGGER = Logger.getLogger(SquareRoot.class.getName());

    private SquareRoot() {
    }

    static int mySqrt(int n) {
        if (n < 2) {
            return n;
        }

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= n / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(mySqrt(2147395600)));
    }
}
