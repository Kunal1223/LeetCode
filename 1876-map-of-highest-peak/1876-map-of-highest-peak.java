class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r = isWater.length;
        int c = isWater[0].length;
        Queue<Pair> qu = new LinkedList<>();

        int[][] matrix = new int[r][c];

        for (int a[] : matrix) {
            Arrays.fill(a, Integer.MAX_VALUE);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (isWater[i][j] == 1) {
                    matrix[i][j] = 0;
                    qu.add(new Pair(i, j));
                }
            }
        }

        while (!qu.isEmpty()) {
            Pair curr = qu.poll();
            int row = curr.first;
            int col = curr.second;

            int[] rm = { 1, 0, -1, 0 };
            int[] cm = { 0, 1, 0, -1 };

            for (int i = 0; i < 4; i++) {
                int nr = row + rm[i];
                int nc = col + cm[i];

                if (nr >= 0 && nc >= 0 && nc < c && nr < r && matrix[nr][nc] > 1 + matrix[row][col]) {
                    matrix[nr][nc] = 1 + matrix[row][col];
                    qu.add(new Pair(nr, nc));
                }
            }
        }

        return matrix;
    }
}