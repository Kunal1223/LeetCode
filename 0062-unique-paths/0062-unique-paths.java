class Solution {

    public int SolveByDynamic(int [][]dp , int i , int j , int m , int n ){

        if(i >= m || j >= n) return 0;
        if(i == m-1 && j == n-1) return 1;

        if(dp[i][j] != -1) return dp[i][j];

        // int straight = SolveByDynamic(dp , i+1 , j , m , n);

        return dp[i][j] = (SolveByDynamic(dp , i+1 , j , m , n) + SolveByDynamic(dp , i , j+1 , m , n));
    }

    public int uniquePaths(int m, int n) {
        
        int i = 0 , j = 0;
        int dp[][] = new int[m+1][n+1];

        for(int k = 0 ; k < dp.length ; k++){
            Arrays.fill(dp[k] , -1);
        }

        return SolveByDynamic(dp , i , j , m , n);
        
    }
}