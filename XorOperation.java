// 1486. XOR Operation in an Array
public class XorOperation {
    static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(4, 3));
    }
}
