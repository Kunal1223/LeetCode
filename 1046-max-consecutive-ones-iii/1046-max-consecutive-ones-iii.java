class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length , max = 0;
        int left = 0 ,right = 0;

        while(right < n){

            if(nums[right] == 1){
                max = Math.max(max , right - left + 1);
                right++;
            }
            else if(k > 0 && nums[right] == 0){
                k--;
                max = Math.max(max , right - left + 1);
                right++;
            }
            else{
                if(nums[left] == 0) k++;
                left++;
            }
        }

        return max;

    }
}