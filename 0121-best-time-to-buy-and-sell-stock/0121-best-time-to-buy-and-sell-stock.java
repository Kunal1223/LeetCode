class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        
        int buyprice = Integer.MAX_VALUE;
        int sell = 0;
        int maxprofit = 0;
        int profit;
        
        for(int i =0 ; i < n ; i++){
            if(prices[i] < buyprice ){
                buyprice = prices[i];
            }
            
            profit = prices[i] - buyprice;
            
            if(maxprofit < profit ){
                maxprofit = profit;
            }
        }
        return maxprofit;
        
    }
    
}