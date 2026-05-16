// 2652. Sum Multiples
public class SumMultiples {
    static int sumOfMultiples(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(10));
    }
}
