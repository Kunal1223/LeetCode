class Solution {
    public int minimumOperations(int[][] grid) {
        int result = 999999999;
        int[][] memo = new int[grid[0].length][10];

        for (int col = 0; col < grid[0].length; col++) {
            for (int tar = 0; tar < 10; tar++) {
                int num = 0;
                for (int row = 0; row < grid.length; row++) {
                    if (grid[row][col] != tar) {
                        num++;
                    }
                }
                memo[col][tar] = num;
            }
        }

        int[][] DP = new int[grid[0].length][10];
        for (int i = 0; i < DP.length; i++) {
            for (int j = 0; j < DP[0].length; j++) {
                DP[i][j] = -1;
            }
        }

        for (int i = 0; i < grid[0].length; i++) {
            for (int target = 0; target < 10; target++) {
                int cost = cost(0, grid[0].length - 1, target, memo, DP);
                result = Math.min(result, cost);
            }
        }

        return result;
    }

    private int cost(int colI, int lastColI, int set, int[][] memo, int[][] DP) {
        if (colI > lastColI) {
            return 0;
        }

        if (DP[colI][set] != -1) {
            return DP[colI][set];
        }

        int minCost = 999999999;
        for (int tar = 0; tar < 10; tar++) {
            if (tar == set) {
                continue;
            }

            int temp = memo[colI][tar];
            temp += cost(colI + 1, lastColI, tar, memo, DP);
            minCost = Math.min(minCost, temp);
        }

        DP[colI][set] = minCost;
        return minCost;
    }
}