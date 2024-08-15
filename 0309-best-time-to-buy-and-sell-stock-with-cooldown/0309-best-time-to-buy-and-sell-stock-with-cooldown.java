class Solution {
    public int fun(int i , int buy , int []prices , int n , int dp[][]){
        if(i >= n) return 0;

        if(dp[i][buy] != -1) return dp[i][buy];

        if(buy == 1){
            return dp[i][buy] = Math.max(-prices[i] + fun(i+1 , 0 , prices , n , dp) , 0 + fun(i+1 , 1 , prices , n , dp));
        }

        return dp[i][buy] = Math.max(prices[i] + fun(i+2 , 1 , prices , n , dp) , 0 + fun(i+1 , 0 , prices , n , dp));
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+1][2];

        for(int a[] : dp){
            Arrays.fill(a , -1);
        }

        return fun(0 , 1 , prices , n , dp);
    }
}