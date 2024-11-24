class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;

        for (int i = 0; i < n; i++) {
            int emptySlot = m - 1;
            for (int j = m - 1; j >= 0; j--) {
                if (box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][emptySlot] = '#';
                    emptySlot--;
                } else if (box[i][j] == '*') {
                    emptySlot = j - 1;
                }
            }
        }

        char[][] ans = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n - 1 - i] = box[i][j];
            }
        }

        return ans;
    }
}
