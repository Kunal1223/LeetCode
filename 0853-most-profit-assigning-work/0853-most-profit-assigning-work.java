class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);
        int ans = 0;

        for(int i = 0 ; i < worker.length ; i++){
            int max = 0; 
            for(int j = 0 ; j < difficulty.length ; j++){
                if(worker[i] >= difficulty[j]){
                    max = Math.max(max , profit[j]);
                }
            }

            ans += max;
        }

        return ans;
    }
}