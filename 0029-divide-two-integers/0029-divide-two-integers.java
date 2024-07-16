class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean neg = (dividend < 0) ^ (divisor < 0);

        long d = Math.abs((long) dividend);
        long v = Math.abs((long) divisor);

        int count = 0;

        while (d >= v) {
            long temp = v;
            long multiple = 1;
            while (d >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            d -= temp;
            count += multiple;
        }

        return neg ? -count : count;
    }
}
