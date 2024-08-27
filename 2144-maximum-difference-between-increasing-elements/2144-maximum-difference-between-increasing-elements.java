class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            int f = nums[i];
            for(int j = i+1 ; j < n ; j++){
                int s = nums[j] - f;

                if(s <= 0){
                    s = -1;
                }
                max = Math.max(s , max);
            }
        }

        return max;
    }
}