class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp , 1);
        
        int mod = 1000000007;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = (dp[j - 1] % mod + dp[j] % mod) % mod;
            }
        }
        return dp[n - 1] % mod;
    }
}
