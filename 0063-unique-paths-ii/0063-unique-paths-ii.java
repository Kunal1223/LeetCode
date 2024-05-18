class Solution {
    
     int SolveByRecursion(int m , int n , int dp[][] , int[][] obstacleGrid){
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        if(obstacleGrid[m][n] == 1) return 0;
        
        
        if(dp[m][n] != -1) return dp[m][n];
        
        int left = SolveByRecursion(m , n-1 , dp , obstacleGrid) ;
        int up = SolveByRecursion(m-1 , n , dp , obstacleGrid);
        
        return dp[m][n] = (up + left);
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m+1][n+1];
        if(obstacleGrid[0][0] == 1) return 0;
        
        for(int a[] : dp){
            Arrays.fill(a , -1);
        }
        
        return SolveByRecursion(m-1 , n-1 , dp , obstacleGrid);
    }
}