// 2894. Divisible and Non-divisible Sums Difference
public class DivisibleSum {
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
        System.out.println(differenceOfSums(5, 1));
    }
}
