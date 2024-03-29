class Solution {
    
    public int solveByTabulation(int[]coins  , int amount){
        
        int max = Integer.MAX_VALUE;
        
        int []dp = new int[amount+1];
        Arrays.fill(dp , max);
        
        dp[0] = 0;
        
        for(int i = 1 ; i <= amount ; i++){
            for(int j  = 0 ; j < coins.length ; j++ ){

                if(i - coins[j] >= 0 && dp[i - coins[j]] != max){
                    dp[i] = Math.min(dp[i] , 1 + dp[i - coins[j]]);
                }
            }
        }
        
        if(dp[amount] == max)
            return -1;
        
        else
            return dp[amount];
    }
    
    
    public int coinChange(int[] coins, int amount) {
        
        return solveByTabulation(coins , amount);
        
    }
}