class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] minDistanceDp = new int[n][n];
        for (int[] dp : minDistanceDp)
            Arrays.fill(dp, (int) 1e4 + 1);
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            minDistanceDp[u][v] = wt;
            minDistanceDp[v][u] = wt;
        }
        for (int i = 0; i < n; i++)
            minDistanceDp[i][i] = 0;
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    if (minDistanceDp[i][k] == (int) 1e4 + 1 || minDistanceDp[k][j] == 
                    (int) 1e4 + 1)
                        continue;
                    minDistanceDp[i][j] = Math.min(minDistanceDp[i][j],
                             minDistanceDp[i][k] + minDistanceDp[k][j]);
                }
        int city = n;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (minDistanceDp[i][j] <= distanceThreshold)
                    count++;
            if (count <= city) {
                city = count;
                ans = i;
            }
        }
        return ans;
    }
}