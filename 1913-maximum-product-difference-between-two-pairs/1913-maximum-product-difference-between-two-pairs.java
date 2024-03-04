class Solution {
    public int maxProductDifference(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        
        int n1 = nums[0]*nums[1];
        int n2 = nums[n-2]*nums[n-1];
        
        return n2-n1;
    }
}