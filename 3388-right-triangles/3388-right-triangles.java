class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int[] row = new int[grid.length];
        Arrays.fill(row, 0);
        
        int[] col = new int[grid[0].length];
        Arrays.fill(col, 0);
        
//         Array prefix SUM
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                row[i]+=grid[i][j];
                col[j]+=grid[i][j];
            }
        }
        
        
//         Count right triangle
        long res=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    res+=(row[i]-1)*(col[j]-1);
                }
            }
        }
        return res;
    }
}