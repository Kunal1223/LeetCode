class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int  n = nums.length;
        
        if(n==1){
            return nums[0];
        }
        
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            
            if(i == n-1){
                return nums[i];
            }
            
            if(nums[i] == nums[i+1]){
                    i++;
            }else{
                return nums[i];
            }
        
        }
        
        return -1;
        
    }
}