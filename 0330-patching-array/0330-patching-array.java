class Solution {
    public int minPatches(int[] nums, int n) {
        int len = nums.length;
        int i = 0 , ans = 0;
        long reach = 0;
        
        while(reach < n){

            if(i >= len){
                reach += reach+1;
                ans++;
            }
            else if( i  < len && nums[i] <= reach+1){
                reach += nums[i];
                i++;
            }else{
                ans++;
                reach += reach+1;
            }
        }

        return ans;  
    }
}