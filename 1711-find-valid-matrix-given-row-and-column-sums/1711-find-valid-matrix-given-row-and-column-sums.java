class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;

        int ans[][] = new int[n][m];
        int i = 0, j = 0;

        while (i < n && j < m) {
            int minval = Math.min(rowSum[i], colSum[j]);
            ans[i][j] = minval;
            rowSum[i] -= minval;
            colSum[j] -= minval;

            if (rowSum[i] == 0) {
                i++;
            }

            if (colSum[j] == 0) {
                j++;
            }

        }

        return ans;

    }
}