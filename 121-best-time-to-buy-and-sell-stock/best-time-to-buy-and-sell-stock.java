class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],maxprofit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            maxprofit=Math.max(maxprofit,cost);
            min=Math.min(min,prices[i]);
        }
        return maxprofit;
    }
}