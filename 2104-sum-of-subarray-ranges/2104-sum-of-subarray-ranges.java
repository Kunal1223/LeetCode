// class Solution {
//         public long subArrayRanges(int[] A) {
//         long res = 0;
//         for (int i = 0; i < A.length; i++) {
//             int max = A[i], min = A[i];
//             for (int j = i; j < A.length; j++) {
//                 max = Math.max(max, A[j]);
//                 min = Math.min(min, A[j]);
//                 res += max - min;
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public long subArrayRanges(int[] A) {
        int n = A.length, j, k;
        long res = 0;
        
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!s.isEmpty() && A[s.peek()] > (i == n ? Integer.MIN_VALUE : A[i])) {
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res -= (long)A[j] * (i - j) * (j - k);

            }
            s.push(i);
        }
        
        s.clear();
        for (int i = 0; i <= n; i++) {
            while (!s.isEmpty() && A[s.peek()] < (i == n ? Integer.MAX_VALUE : A[i])) {
                j = s.pop();
                k = s.isEmpty() ? -1 : s.peek();
                res += (long)A[j] * (i - j) * (j - k);

            }
            s.push(i);
        }
        return res;
    }
}