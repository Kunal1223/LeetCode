import java.util.Stack;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) return 0;
        
        // Find the left boundary of the unsorted subarray
        int left = 0;
        while (left < n - 1 && nums[left] <= nums[left + 1]) {
            left++;
        }
        
        // If the entire array is sorted
        if (left == n - 1) return 0;
        
        // Find the right boundary of the unsorted subarray
        int right = n - 1;
        while (right > 0 && nums[right] >= nums[right - 1]) {
            right--;
        }
        
        // Find the minimum and maximum elements within the unsorted subarray
        int minInRange = Integer.MAX_VALUE;
        int maxInRange = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            minInRange = Math.min(minInRange, nums[i]);
            maxInRange = Math.max(maxInRange, nums[i]);
        }
        
        // Expand the unsorted subarray to include any elements that are out of order
        while (left >= 0 && nums[left] > minInRange) {
            left--;
        }
        while (right < n && nums[right] < maxInRange) {
            right++;
        }
        
        // Calculate and return the length of the unsorted subarray
        return right - left - 1;
    }
}
