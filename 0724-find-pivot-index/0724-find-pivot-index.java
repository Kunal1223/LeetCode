class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0 , n = nums.length;
        int leftsum = 0;

        for(int a : nums){
            totalsum += a;
        }

        for(int i = 0 ; i < n ; i++){
            int newtotal = totalsum - nums[i];
            int rightsum = newtotal - leftsum;

            if(leftsum == rightsum) return i;

            leftsum += nums[i];
        }
        
        return -1;
        
    }
}