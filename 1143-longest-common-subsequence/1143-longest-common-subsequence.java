class Solution {
    
    public int Recursion(int n , int m , String t1 , String t2 ,int dp[][]){
        
        if(n < 0 || m < 0)
            return 0;
        
        if(dp[n][m] != -1)
            return dp[n][m];
        
        if(t1.charAt(n) == t2.charAt(m)){
            return dp[n][m] = 1 + Recursion(n-1 , m-1 , t1 , t2 , dp );
        }
        
        return dp[n][m] = Math.max( Recursion(n , m-1 , t1 , t2 ,dp ) ,  Recursion(n-1 , m , t1 , t2 ,dp));
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length()-1;
        int m = text2.length()-1;
        
        int dp[][] = new int[n+1][m+1];
            
        for(int i = 0 ; i < n+1 ; i++){
            Arrays.fill(dp[i] , -1);
        }
        
        int ans = Recursion(n , m , text1 , text2 , dp);
        return ans;
        
    }
}