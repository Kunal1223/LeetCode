class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        if (n == 0) return 0;
        
        int left = 0, right = 0, maxLen = 0;
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> b - a); 
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        while (right < n) {
            max.add(nums[right]);
            min.add(nums[right]);
            
            while (max.peek() - min.peek() > limit) {
                max.remove(nums[left]);
                min.remove(nums[left]);
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        
        return maxLen;
    }
}
