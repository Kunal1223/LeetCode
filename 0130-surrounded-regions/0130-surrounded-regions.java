class Solution {

    public void dfs(int i, int j, char[][] board, int[][] visit, int[] newrow, int[] newcol) {
        visit[i][j] = 1;

        for (int m = 0; m < 4; m++) {
            int nrow = i + newrow[m];
            int ncol = j + newcol[m];

            if (nrow >= 0 && nrow < board.length && ncol >= 0 && ncol < board[0].length && visit[nrow][ncol] == 0 && board[nrow][ncol] == 'O') {
                dfs(nrow, ncol, board, visit, newrow, newcol);
            }
        }
    }

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] visit = new int[n][m];

        int[] newrow = {1, 0, -1, 0};
        int[] newcol = {0, 1, 0, -1};

        // Mark boundary 'O's and their connected 'O's
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && visit[i][0] == 0) {
                dfs(i, 0, board, visit, newrow, newcol);
            }
            if (board[i][m - 1] == 'O' && visit[i][m - 1] == 0) {
                dfs(i, m - 1, board, visit, newrow, newcol);
            }
        }

        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O' && visit[0][j] == 0) {
                dfs(0, j, board, visit, newrow, newcol);
            }
            if (board[n - 1][j] == 'O' && visit[n - 1][j] == 0) {
                dfs(n - 1, j, board, visit, newrow, newcol);
            }
        }

        // Flip all 'O's to 'X's that are not marked as visited
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O' && visit[i][j] == 0) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        solution.solve(board);

        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
