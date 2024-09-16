class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2];
        int n = nums.length , j = 0;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);

            if(map.get(nums[i]) == 2){
                ans[j++] = nums[i];
            }
        }

        return ans;
    }
}