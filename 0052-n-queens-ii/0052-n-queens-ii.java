class Solution {

    int ans = 0;

    public boolean isSafe(int row, int col, char[][] board) {
        boolean result = true;

        int srow = row;
        int scol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        row = srow;
        col = scol;
        while (col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            col--;
        }

        row = srow;
        col = scol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q')
                return false;
            row++;
            col--;
        }

        return true;
    }

    public void dfs(int n, int col, char[][] board) {
        if (col == board.length) {
            ans++;
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                dfs(n, col + 1, board);
                board[row][col] = '.';
            }
        }
    }

    public int totalNQueens(int n) {
        char board[][] = new char[n][n];

        for (char b[] : board) {
            Arrays.fill(b, '.');
        }

        dfs(n, 0, board);
        return ans;
    }
}