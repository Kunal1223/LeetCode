class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int sum  = 0;
        int maxsum  = 0;

        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] < nums[i]){
               sum++;

                if(sum > maxsum)
                    maxsum = sum;
            }

            else
                sum = 0;
            
        }

        return maxsum+1;
    }
}