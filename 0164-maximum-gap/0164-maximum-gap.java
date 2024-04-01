class Solution {
    public int maximumGap(int[] nums) {
        
        int maxsum = 0;
        int sum = 0;

        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length-1 ; i++){

                if(nums[i] < nums[i+1]){
                    sum = nums[i+1] - nums[i];

                    if(sum > maxsum ){
                        maxsum = sum;
                    }
                }

        }

        return maxsum;
    }
}