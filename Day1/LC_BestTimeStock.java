public class LC_BestTimeStock {

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        LC_BestTimeStock n = new LC_BestTimeStock();

        System.out.println(n.maxProfit(prices));
    }
}