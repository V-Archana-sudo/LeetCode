class Solution {
    public int maxProfit(int[] prices) {
        int Min = prices[0];
        int ans = 0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i] - Min;
            if(profit>ans){
                ans = profit;
            }
            Min = Math.min(prices[i],Min);
        }
        return ans;
    }
}
