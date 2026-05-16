// 1672. Richest Customer Wealth
public class RichestCustomerWealth {
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
        System.out.println(maximumWealth(accounts));
    }
}
