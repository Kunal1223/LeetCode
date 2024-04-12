class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0 ;
        int right = 0 ;
        int sum = 0;
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        
        while(left < n){
            
            while(right < n && sum < target){
                sum += nums[right];
                right++;
            }
            
            if( sum >= target){
                ans = Math.min(ans , right - left );
            }
            
            sum -= nums[left];
            left++;
        
        }
        
        if(ans != Integer.MAX_VALUE){
            return ans;
        }
        
        return 0;
        
    }
}