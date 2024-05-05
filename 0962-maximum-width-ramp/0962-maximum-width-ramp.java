class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        int[] minval = new int[n];
        minval[0] = nums[0];
        
        for(int i= 1; i < n ; i++){
            minval[i] = Math.min(minval[i-1] , nums[i]);
        }

        int i = n-1, j = n-1 ;
        int dist = Integer.MIN_VALUE;

        while(i>=0 && j >= 0){

            if(nums[i] >= minval[j]){
                dist = Math.max(dist , (i-j));
                j--;
            }else{
                i--;
            }
        }

        return dist;
    }
}
