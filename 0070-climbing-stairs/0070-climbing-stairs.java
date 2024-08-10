class Solution {

    public int waytoclimb(int n , int []dp){
        if(n == 0) return 1;
        if(n < 0) return 0;

        if(dp[n] != -1) return dp[n];

        dp[n] = waytoclimb(n-1 , dp) + waytoclimb(n-2 , dp);
        return dp[n];
    }


    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int dp[] = new int[n+1];
        Arrays.fill(dp , -1);

        return waytoclimb(n , dp);
    }
}