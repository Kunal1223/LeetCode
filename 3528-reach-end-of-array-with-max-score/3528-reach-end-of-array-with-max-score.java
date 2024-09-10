class Solution {
    public long findMaximumScore(List<Integer> num) {
        long ans = 0 , max = 0;

        for(int a : num){
            ans += max;
            max = Math.max(a , max);
        }

        return ans;
    }
}
