class Solution {

    public int SolveByRecursion(int []values , int i , int j , int dp[][]){
        if(i+1 == j) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        int ans = Integer.MAX_VALUE;

        for(int k = i + 1 ; k < j ; k++){
            ans = Math.min(ans ,  ((values[i] * values[j] * values[k]) + 
            SolveByRecursion(values , i , k , dp) + SolveByRecursion(values , k , j , dp)));
        } 

        dp[i][j] = ans;

        return dp[i][j];
    }

    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int dp[][] = new int[n+1][n+1];

        for(int a[] : dp){
            Arrays.fill(a , -1);
        }

        return SolveByRecursion(values, 0, n - 1 , dp);

    }
}