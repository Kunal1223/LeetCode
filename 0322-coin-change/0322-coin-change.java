class Solution {

    public int SolveByRecursion(int []coins , int amount , int ind , int[][] dp){
        if(ind == 0){
            if(amount % coins[0] == 0){
                return amount / coins[0];
            }
            else{
                return (int) Math.pow(10 , 9);
            }
        }

        if(dp[ind][amount] != -1) return dp[ind][amount];

        int nottake = 0 + SolveByRecursion(coins , amount , ind -1 , dp);
        int take = (int) Math.pow(10 , 9);

        if(coins[ind] <= amount){
            take = 1 + SolveByRecursion(coins , amount - coins[ind] , ind , dp);
        }

        return dp[ind][amount] = Math.min(take , nottake);
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];

        for(int a[] : dp){
            Arrays.fill(a , -1);
        }

        int ans = SolveByRecursion(coins , amount , n-1  , dp);

        if(ans >= (int) Math.pow(10 , 9)) return -1;
        else return ans;
    }
}