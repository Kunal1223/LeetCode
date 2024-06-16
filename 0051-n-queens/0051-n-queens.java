class Solution {

    public List<String> Construct(char [][]board){
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < board.length ; i++){
            String store = new String(board[i]);
            list.add(store);
        }
        return list;
    }

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

    public void dfs(int n, int col, char[][] board , List<List<String>> res) {
        if (col == board.length) {
            res.add(Construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                dfs(n-1, col + 1, board , res);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];

        for (char b[] : board) {
            Arrays.fill(b, '.');
        }

        dfs(n, 0, board , ans);
        return ans;
    }
}