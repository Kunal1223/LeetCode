class Solution {

    public int Solve(int[] nums, int[][] dp, int ind, int target) {
        if (ind == 0) {
            if (target == 0 && nums[0] == 0) return 2;
            if (target == 0 || target == nums[0]) return 1;
            return 0;
        }

        if (dp[ind][target] != -1) return dp[ind][target];

        int nottake = Solve(nums, dp, ind - 1, target);
        int take = 0;

        if (nums[ind] <= target) {
            take = Solve(nums, dp, ind - 1, target - nums[ind]);
        }

        return dp[ind][target] = take + nottake;
    }


    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;

        for (int a : nums) {
            sum += a;
        }

        if ((sum - target) < 0 || (sum - target) % 2 != 0) return 0;

        int newtarget = (sum - target) / 2;
        int[][] dp = new int[n][newtarget + 1];

        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        return Solve(nums, dp, n - 1, newtarget);
    }
}
