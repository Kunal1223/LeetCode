class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long sum = 0, ssum = 0;

        for(int i : nums) {
            sum += i;
        }

        long minDiff = Long.MAX_VALUE;
        int res = 0;

        for(int i = 0; i < n; i++) {
            ssum += nums[i];
            sum -= nums[i];

            long leftAvg = ssum / (i + 1);
            long rightAvg = (i != n - 1) ? sum / (n - i - 1) : 0;

            long diff = Math.abs(leftAvg - rightAvg);

            if(diff < minDiff) {
                minDiff = diff;
                res = i;
            }
        }

        return res;
    }
}
