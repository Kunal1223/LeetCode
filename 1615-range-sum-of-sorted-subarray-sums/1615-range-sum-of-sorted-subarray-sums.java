class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int m = n * (n + 1) / 2;
        int[] ans = new int[m];
        int k = 0;
        int mod = 1000000007;

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum = (sum + nums[j]) % mod;
                ans[k++] = (int) sum;
            }
        }

        Arrays.sort(ans);

        long val = 0;
        for (int i = left - 1; i < right; i++) {
            val = (val + ans[i]) % mod;
        }

        return (int) val;
    }
}
