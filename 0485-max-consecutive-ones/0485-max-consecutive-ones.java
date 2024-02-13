class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int sum = 0;
        int maxsum = 0;
        
        for(int i= 0 ; i < nums.length ; i++){
            
            if(nums[i] == 1){
                sum++;
            }
            else{
                
                if(maxsum <= sum){
                    maxsum = sum;
                    sum = 0;
                }
                     
                sum = 0;
            }
        }
        
        if(maxsum < sum){
            return sum;
        }
        
        return maxsum;
        
    }
}