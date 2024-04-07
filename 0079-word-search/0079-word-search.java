class Solution {
    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        boolean [][] valid = new boolean[n][m];
        boolean result = false;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(board[i][j] == word.charAt(0))
                    result = backtrack(i , j , word , board , valid ,  0);

                if(result){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean backtrack(int i , int j , String word , char[][] board ,
        boolean[][] valid  , int index){

            if(index == word.length())
                return true;

            if( i < 0 || i >= board.length  || j < 0 || j >= board[0].length 
                || board[i][j] != word.charAt(index) || valid[i][j])
                return false;

            valid[i][j] = true;

            if( backtrack(i+1 , j , word , board , valid ,  index+1) ||
                backtrack(i-1 , j , word , board , valid ,  index+1) ||
                backtrack(i , j+1 , word , board , valid ,  index+1) ||
                backtrack(i , j -1 , word , board , valid ,  index+1) 
            )
                return true;

            valid[i][j] = false;

            return false;

        }
}