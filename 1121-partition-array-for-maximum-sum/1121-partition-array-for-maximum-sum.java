class Solution {
    public int SolveByRecursion(int []arr , int k , int n , int ind , int []dp){

        if(ind == n) return 0;
        if(dp[ind] != -1) return dp[ind];

        int len = 0;
        int max = Integer.MIN_VALUE;
        int maxans = Integer.MIN_VALUE;

        for(int i = ind ; i < Math.min(n , ind+k) ; i++){
            len++;
            max = Math.max(arr[i] , max);
            int sum = max*len + SolveByRecursion(arr , k , n , i+1 , dp);
            maxans = Math.max(maxans , sum);
        }

        return dp[ind] = maxans;
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        if(n == 1) return arr[0];
        int dp[] = new int[n+1];

        Arrays.fill(dp , -1);

        return SolveByRecursion(arr , k , n , 0 , dp);
    }
}