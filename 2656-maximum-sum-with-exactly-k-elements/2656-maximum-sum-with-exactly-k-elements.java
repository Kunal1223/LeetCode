class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;

        while(k >0){
            int s = nums[n-1];
            sum += s;
            nums[n-1] = s+1;
            k--;    
        }
        

        return sum;
        
    }
}