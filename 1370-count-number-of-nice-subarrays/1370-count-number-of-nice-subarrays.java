class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int ans = 0;

        for(int i = 0; i < n; i++)
        {
            sum += (nums[i] % 2 == 0) ? 0 : 1;

            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum , 0)+1);
        }

        return ans;
    }
}