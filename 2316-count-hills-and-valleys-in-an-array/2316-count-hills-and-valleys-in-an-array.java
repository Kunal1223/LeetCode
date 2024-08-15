class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 1 ; i < n-1 ; i++){
            int left = i-1;
            int right = i+1;

            while(left >= 0 && nums[i] == nums[left]){ left--;}
            if(left < 0 ) continue;

            while(right < n && nums[i] == nums[right]){ right++;}
            if(right == n) continue;

            if(nums[i] > nums[left] && nums[i] > nums[right]){
                if(nums[i] != nums[i-1]) ans++;
                else continue;
            }
            if(nums[i] < nums[left] && nums[i] < nums[right]){
                if(nums[i] != nums[i-1]) ans++;
                else continue;
            }
        }


        return ans++;   
    }
}