class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        
        long sum = 0; 
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        long req = Math.abs((long)goal - sum); 
        
        double res = Math.ceil(req * 1.0 / limit); 
        
        return (int)res; 
    }
}
