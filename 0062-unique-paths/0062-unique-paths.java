class Solution {
    
    int SolveByRecursion(int m , int n , int dp[][]){
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;
        
        if(dp[m][n] != -1) return dp[m][n];
        
        int left = SolveByRecursion(m , n-1 , dp) ;
        int up = SolveByRecursion(m-1 , n , dp);
        
        return dp[m][n] = (up + left);
    }
    
    public int uniquePaths(int m, int n) {
        
        int dp[][] = new int[m+1][n+1];
        
        for(int a[] : dp){
            Arrays.fill(a , -1);
        }
        
        return SolveByRecursion(m-1 , n-1 , dp);
        
    }
}