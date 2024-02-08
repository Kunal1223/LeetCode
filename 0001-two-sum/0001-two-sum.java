class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        
        int len = nums.length;
        int count = 0;
        
        for (int i =0 ; i < len ; i++){
            for(int j =i+1 ; j < len ; j++){

                if(nums[i] + nums[j] == target){
                    ans[count] = i;
                    ans[count+1] = j;
                    return ans;
                }
            }
        }
        
        return ans;
        
    }
}