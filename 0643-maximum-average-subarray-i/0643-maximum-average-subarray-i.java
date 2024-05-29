class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length , j = 0;
        double sum = 0 , ans = Integer.MIN_VALUE;;

        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }

        if(k == n) return sum / k;

        for(int i = k ; i < n ; i++){
            double temp = sum / k;
            ans = Math.max(temp , ans);

            sum += nums[i];
            sum -= nums[j++];
        }

        double temp = sum / k;
        return Math.max(temp , ans);
    }
}