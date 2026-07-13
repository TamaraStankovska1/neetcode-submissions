class Solution {
    public int maxProfit(int[] prices) {
        int min = 1000;
        int maxProfit = 0;
        int i;
        for (i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}