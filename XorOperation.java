// 1486. XOR Operation in an Array
import java.util.logging.Logger;

public class XorOperation {
    private static final Logger LOGGER = Logger.getLogger(XorOperation.class.getName());

    private XorOperation() {
    }

    static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(xorOperation(4, 3)));
    }
}
