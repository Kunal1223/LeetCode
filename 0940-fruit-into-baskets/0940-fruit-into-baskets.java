class Solution {
    public int totalFruit(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        Map<Integer , Integer> map = new HashMap<>();
        int left = 0 , max = -5;

        for(int right = 0 ; right < n ; right++){
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);

            while(map.size() > 2){
                map.put(nums[left] , map.get(nums[left]) - 1);

                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }

                left++;
            }

            max = Math.max(max , right - left + 1);
        }

        return max;
    }
}