public class Solution {
    public int minOperations(int n) {
        int target = -1;
        if ((n & 1) == 1)
            target = ((n / 2) * 2) + 1;
        else
            target = n;

        int res = 0;
        for (int i = 0; i < (n + 1) / 2; i++) {
            int cal = 2 * i + 1;
            res += target - cal;
        }

        return res;
    }
}