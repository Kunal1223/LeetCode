class Solution {
    public int getMaxLen(int[] nums) {
        int poslen = 0;
        int neglen = 0 , ans = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                poslen = 0;
                neglen = 0;
            }

            else if(nums[i] > 0){
                poslen++;
                neglen = neglen == 0 ? 0 : neglen + 1;
            }
            else{
                int temp = poslen;
                poslen = neglen == 0 ? 0 : neglen + 1;
                neglen = temp + 1;
            }

            ans = Math.max(ans , poslen);
        }

        return ans;
    }
}