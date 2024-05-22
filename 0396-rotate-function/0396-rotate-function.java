class Solution {
    public int maxRotateFunction (int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;

        int sum = 0, F0 = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F0 += i * nums[i];
        }

        int dp [] = new int [n];
        dp[0] = F0;
        max = dp[0];

        for (int i = 1; i < n; i++) {
            dp [i] = dp [i-1] + sum - n * nums[n - i];
            max = Math.max (max, dp [i]);
        }
        return max;
    }
}