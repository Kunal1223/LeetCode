class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer , Integer> map = new HashMap<>();

        long sum = 0 , max = 0;
        int left = 0;

        for(int right = 0; right < n ; right++){
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);
            sum += nums[right];

            if((right - left + 1) == k){
                if(map.size() == k){
                    max = Math.max(max , sum);
                    sum -= nums[left];
                    map.remove(nums[left]);
                    left++;
                }
                else{
                    sum -= nums[left];
                    map.put(nums[left] , map.get(nums[left]) -1);

                    if(map.get(nums[left]) == 0)
                        map.remove(nums[left]);

                    left++;
                }
            }
        }

        return max;
    }
}