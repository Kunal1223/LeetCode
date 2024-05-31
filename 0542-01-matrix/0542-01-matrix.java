class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize the distance matrix and the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;
                    queue.offer(new int[] { i, j });
                } else {
                    ans[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // Direction vectors for moving up, down, left, and right
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        // Process the queue using BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < n && newY >= 0 && newY < m && ans[newX][newY] > ans[x][y] + 1) {
                    ans[newX][newY] = ans[x][y] + 1;
                    queue.offer(new int[] { newX, newY });
                }
            }
        }

        return ans;
    }
}