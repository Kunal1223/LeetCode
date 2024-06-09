class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        int count = 0 , sum = 0 ;
        int n = nums.length;
        if(n == 1){
            if(nums[0] % k == 0) return 1;
            else return 0;
        }

        map.put(0 , 1);
        
        for(int i = 0 ; i < n ; i++){
            sum = (sum + nums[i]) % k;

            if(sum < 0) sum += k;

            count += map.getOrDefault(sum , 0);
            map.put(sum , map.getOrDefault(sum , 0)+1);
        }

        return count;

    }
}