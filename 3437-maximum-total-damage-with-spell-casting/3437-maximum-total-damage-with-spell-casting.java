class Solution {
    public long maximumTotalDamage(int[] power) {

        int n = power.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int p: power)
            freq.put(p, freq.getOrDefault(p, 0)+1);

        int s = freq.size();
        int unqPow[] = new int[s];

        int i=0;
        for(int key: freq.keySet()) 
            unqPow[i++] = key;

        Arrays.sort(unqPow);
        long dp[] = new long[s];
        
        dp[0] = (long)unqPow[0] * freq.get(unqPow[0]);
        for(i=1; i<s;i++){

            dp[i] = dp[i-1];
            long curPower = unqPow[i] * freq.get(unqPow[i]);
            long curTotalPower = curPower;
            
            for(int j = i-1; j>=0 && j>=i-3;j--){
                if(unqPow[j] < unqPow[i]-2){
                    curTotalPower = Math.max(curTotalPower, curPower + dp[j]);
                }
            }
            dp[i] = Math.max(dp[i], curTotalPower);
        }
        return dp[s-1];
    }
}