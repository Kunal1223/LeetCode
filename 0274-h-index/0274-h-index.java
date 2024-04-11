import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int m = Math.min(citations[i], n - i);
            ans = Math.max(ans, m);
        }

        return ans;
    }
}
