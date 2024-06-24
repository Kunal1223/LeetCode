class Solution {

    public int SolveByRecursion(int []days , int []costs , int ind , int dp[]){
        int n = days.length;
        if(ind >= n){
            return 0;
        }

        if(dp[ind] != -1) return dp[ind];

        int first = costs[0] + SolveByRecursion(days , costs , ind+1 , dp);

        int i = ind ;
        for(; i < n && days[i] < days[ind] + 7 ; i++);
        int second = costs[1] + SolveByRecursion(days , costs , i , dp);

        i = ind ;
        for(; i < n && days[i] < days[ind] + 30 ; i++);
        int third = costs[2] + SolveByRecursion(days , costs , i , dp);

        dp[ind] = Math.min(first , Math.min(second , third));
        return dp[ind];
    }

    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days.length + 1];
        Arrays.fill(dp , -1);

        return SolveByRecursion(days , costs , 0 , dp);
    }
}