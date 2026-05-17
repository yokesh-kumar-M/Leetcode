// 121. Best Time to Buy and Sell Stock
import java.util.logging.Logger;

public class BestTimeToBuySellStock {
    private static final Logger LOGGER = Logger.getLogger(BestTimeToBuySellStock.class.getName());

    private BestTimeToBuySellStock() {
    }

    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        LOGGER.info(() -> String.valueOf(maxProfit(prices)));
    }
}
