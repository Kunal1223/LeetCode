class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int totalOne = 0;
        for (int num : nums) {
            if (num == 1) {
                totalOne++;
            }
        }

        int zeroCount = 0;
        for (int i = 0; i < totalOne; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        int minSwaps = zeroCount;

        for (int i = 1; i < n; i++) {
            if (nums[(i - 1) % n] == 0) {
                zeroCount--;
            }
            
            if (nums[(i + totalOne - 1) % n] == 0) {
                zeroCount++;
            }
            minSwaps = Math.min(minSwaps, zeroCount);
        }

        return minSwaps;
    }
}
