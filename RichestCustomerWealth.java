// 1672. Richest Customer Wealth
import java.util.logging.Logger;

public class RichestCustomerWealth {
    private static final Logger LOGGER = Logger.getLogger(RichestCustomerWealth.class.getName());

    private RichestCustomerWealth() {
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int money : customer) {
                sum += money;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        LOGGER.info(() -> String.valueOf(maximumWealth(accounts)));
    }
}
