class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;

        long total = 0;
        int nCount = 0 , n = matrix.length , m = matrix[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < 0)
                    nCount++;

                int value = Math.abs(matrix[i][j]);
                min = Math.min(min, value);
                total += value;
            }
        }

        if (nCount % 2 == 0)
            return total;

        return total - 2 * min;
    }
}