class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        // ################# this is brute force method ###################
        int n = matrix.length;
        int m = matrix[0].length , l = 0;
        int a[] = new int[n*n];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                a[l++] = matrix[i][j];
            }
        }

        Arrays.sort(a);

        return a[k-1];

        
        
    }
}