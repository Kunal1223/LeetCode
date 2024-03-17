class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        
        if(n <= 1){
            return true;
        }
        
        int curr = 0;
        int far = 0;
        
        boolean res = false;
        
        for(int i = 0 ; i < n-1 ; i++){

            far = Math.max(far , i+nums[i]);

            if(curr == i ){
                curr = far;
                
                if (curr >= n - 1) {
                     res = true;
                     break;
                }
               
            }
        }
        
        return res;
    }
}