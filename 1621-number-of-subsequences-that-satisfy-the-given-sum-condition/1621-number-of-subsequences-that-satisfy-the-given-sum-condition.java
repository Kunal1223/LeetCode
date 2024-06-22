class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int exp[] = new int[n];
        int mod = 1000000007;

        Arrays.sort(nums);
        exp[0] = 1;

        for(int i = 1 ; i < n ; i++){
            exp[i] = (exp[i-1] * 2) % mod;
        }

        int i = 0 , j = n-1 , count = 0;

        while(i <= j ){
            if(nums[i] + nums[j] <= target){
                count = (exp[j - i] + count) % mod ;
                i++;
            }else{
                j--;
            }
        }

        return count % mod;
    }
}