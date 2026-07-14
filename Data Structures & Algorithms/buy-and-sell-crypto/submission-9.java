class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = 1000;
        
        for(int i = 0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            
            if(prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}