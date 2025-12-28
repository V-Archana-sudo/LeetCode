class Solution {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0];
        int ans = 0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-minsofar;
            if(profit>ans){
                ans=profit;
            }
            minsofar=Math.min(prices[i],minsofar);
        }
        return ans;   
    }
}