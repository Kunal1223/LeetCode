class Solution {

    private int max;
    public int SolveByRecursion(char matrix[][] , int i , int j , int a[][]){
        if(i >= matrix.length || j >= matrix[0].length ){
            return 0;
        }

        if(a[i][j] != -1){
            return a[i][j];
        }

        int ans = 0;
        int right = SolveByRecursion(matrix , i , j+1 , a);
        int down = SolveByRecursion(matrix , i+1 , j , a);
        int dio = SolveByRecursion(matrix , i+1 , j+1 ,a);

        if(matrix[i][j] == '1'){
            a[i][j] = 1 + Math.min(right , Math.min(down , dio));
            max = Math.max( a[i][j] , max);
            return a[i][j];
        }else{
            return 0;
        }
    }

    public int maximalSquare(char[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        max = 0;

        int a[][] = new int[n+1][m+1];

        for(int i = 0 ; i < n ; i++){
            Arrays.fill(a[i] , -1);
        }
        
        SolveByRecursion(matrix , 0 , 0 , a);
        return max*max;
    }
}