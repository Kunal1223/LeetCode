class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length , ans = 0;

        int max = 1 , min = 100000;
        for(int a : nums){
            max = Math.max(max , a);
        }

        for(int a : nums){
            min = Math.min(min , a);
        }

        for(int i = 1 ; i <= min ; i++){
            if(min % i == 0 && max % i == 0){
                ans = Math.max(ans , i);
            }
        }

        return ans;

    }
}