class Solution {

    public boolean SolveByRecursion(int ind, int nums[], int target, Boolean dp[][]) {
        if (ind < 0) return false;
        if(ind == 0) return nums[0] == target;
        if (target == 0) return true;

        if (dp[ind][target] != null) return dp[ind][target];

        boolean take = SolveByRecursion(ind - 1, nums, target, dp);
        boolean nottake = false;
        if (target - nums[ind] >= 0) {
            nottake = SolveByRecursion(ind - 1, nums, target - nums[ind], dp);
        }

        return dp[ind][target] = (take || nottake);
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        int n = nums.length;
        // Use Boolean instead of boolean to distinguish between uninitialized and false values
        Boolean dp[][] = new Boolean[n][target + 1];

        return SolveByRecursion(n - 1, nums, target, dp);
    }
}
