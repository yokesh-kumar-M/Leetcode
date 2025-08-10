public class buyandsell1 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1730065004/
        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices){
        //comparing the digits
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){
                // if minPrice is updated then no need to check for profit
                minPrice = prices[i];
            } else{
                int profit = prices[i] - maxProfit;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
