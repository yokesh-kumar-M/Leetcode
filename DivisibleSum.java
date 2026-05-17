// 2894. Divisible and Non-divisible Sums Difference
import java.util.logging.Logger;

public class DivisibleSum {
    private static final Logger LOGGER = Logger.getLogger(DivisibleSum.class.getName());

    private DivisibleSum() {
    }

    static int differenceOfSums(int n, int m) {
        int divisible = 0;
        int nonDivisible = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                divisible += i;
            } else {
                nonDivisible += i;
            }
        }
        return nonDivisible - divisible;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(differenceOfSums(5, 1)));
    }
}
