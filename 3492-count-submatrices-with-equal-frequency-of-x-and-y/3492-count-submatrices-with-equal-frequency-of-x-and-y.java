class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length, m = grid[0].length, res = 0;
        int[][] xdir = new int[n + 1][m + 1], ydir = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                xdir[i + 1][j + 1] = xdir[i][j + 1] + xdir[i + 1][j] - xdir[i][j] + 
                        (grid[i][j] == 'X' ? 1 : 0);

                ydir[i + 1][j + 1] = ydir[i][j + 1] + ydir[i + 1][j] - ydir[i][j] + 
                        (grid[i][j] == 'Y' ? 1 : 0);

                if (xdir[i + 1][j + 1] == ydir[i + 1][j + 1] && xdir[i + 1][j + 1] > 0) {
                    res++;
                }
            }
        }
        return res;
    }
}