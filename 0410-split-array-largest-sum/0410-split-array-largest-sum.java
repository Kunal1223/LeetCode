class Solution {

    public int FindMax(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int a : nums) {
            max = Math.max(max, a);
        }

        return max;
    }

    public int FindSum(int nums[]) {
        int sum = 0;
        for (int a : nums) {
            sum += a;
        }

        return sum;
    }

    public int FindSplit(int[] nums, int val) {
        int count = 1, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= val) {
                sum += nums[i];
            } else {
                sum = nums[i];
                count++;
            }
        }

        return count;
    }

    public int splitArray(int[] nums, int k) {
        if (nums.length < k) return -1;
        int low = FindMax(nums) , result = -1;
        int high = FindSum(nums);

        while(low <= high) {
            int mid = (low + high)/2;

            int split = FindSplit(nums, mid);

            if (split <= k) {
                result = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return result;
    }
}