class Solution {
    public int SumOf(int x){
        int sum = 0;

        while(x != 0){
            sum += x % 10;
            x = x / 10;
        }

        return sum;
    }

    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            nums[i] = SumOf(nums[i]);
            min = Math.min(nums[i] , min);
        }

        return min;
    }
}