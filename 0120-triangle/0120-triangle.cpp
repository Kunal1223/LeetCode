class Solution {
public:

long long  dp[201][201];
    long long minimumTotal(vector<vector<int>>& grid) 
    {
        memset(dp,-1,sizeof(dp));
        int r=grid.size();
        int c=grid[r-1].size();
        long long  ans=INT_MAX;
        for(int j=0;j<c;j++)
        {
            ans=min(ans,solve(r-1,j,grid));
        }
        return ans;        
    }
    long long  solve(int i,int j,vector<vector<int>>& grid) 
    {
        if(i<0||j<0||j>=grid[i].size())
        {
            return INT_MAX;
        }
        if(i==0)
        {
            return grid[i][j];
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        long long  w1=grid[i][j]+solve(i-1,j,grid);
        long long w2=grid[i][j]+solve(i-1,j-1,grid);
        return dp[i][j]=min(w1,w2);
    }
};