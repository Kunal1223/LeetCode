class Solution {
        public long minimumCost(int m, int n, int[] h, int[] v) {
        Arrays.sort(h);
        Arrays.sort(v);
        long sumH = 0, sumV = 0, res = 0;
        for (int x : h) sumH += x;
        for (int x : v) sumV += x;

        int i = h.length - 1, j = v.length - 1;
        while (i >= 0 && j >= 0) {
            if (h[i] > v[j]) {
                res += h[i] + sumV;
                sumH -= h[i--];
            } else {
                res += v[j] + sumH;
                sumV -= v[j--];
            }
        }
        return res + sumH + sumV;
    }
}