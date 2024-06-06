class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        int n = dp.length , m = dp[0].length;

        for(int i = n -1 ; i >= 0 ; i--){
            for(int j = m-1 ; j >= 0 ; j--){

                if(i == n -1 && j == m -1){
                    dp[i][j] = 0;
                }
                else if(i == n - 1){
                    dp[i][j] = (int) s2.charAt(j) + dp[i][j+1];
                }else if(j == m -1){
                    dp[i][j] = (int) s1.charAt(i) + dp[i+1][j];
                }
                else{
                    if(s1.charAt(i) == s2.charAt(j)){
                        dp[i][j] = dp[i+1][j+1];
                    }else{
                        dp[i][j] = Math.min(((int) s1.charAt(i) + dp[i+1][j]) , 
                            ((int) s2.charAt(j) + dp[i][j+1]));
                    }
                }
            }
        }

        return dp[0][0];
        
    }
}