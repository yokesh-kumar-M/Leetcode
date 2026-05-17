import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// 1726. Tuple with Same Product
public class TuplesWithSameProduct {
    private static final Logger LOGGER = Logger.getLogger(TuplesWithSameProduct.class.getName());

    private TuplesWithSameProduct() {
    }

    static int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productCount.merge(product, 1, Integer::sum);
            }
        }

        int count = 0;
        for (int freq : productCount.values()) {
            count += 8 * freq * (freq - 1) / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 6};
        LOGGER.info(() -> String.valueOf(tupleSameProduct(nums)));
    }
}
