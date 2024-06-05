import java.util.Arrays;

public class Solution {

    public int solve(int zero, int one, boolean check, int limit, int[][][] dp) {
        if (zero == 0 && one == 0) return 1;

        int mod = 1000000007;
        int ans = 0;
        int checkInt = check ? 1 : 0;

        if (dp[zero][one][checkInt] != -1) return dp[zero][one][checkInt];

        if (check == true) {
            for (int i = 1; i <= Math.min(one, limit); i++) {
                ans = (ans + solve(zero, one - i, false, limit, dp)) % mod;
            }
        } else {
            for (int i = 1; i <= Math.min(zero, limit); i++) {
                ans = (ans + solve(zero - i, one, true, limit, dp)) % mod;
            }
        }

        dp[zero][one][checkInt] = ans;
        return ans;
    }

    public int numberOfStableArrays(int zero, int one, int limit) {
        int mod = 1000000007;
        int[][][] dp = new int[202][202][2];

        for (int[][] array2D : dp) {
            for (int[] array1D : array2D) {
                Arrays.fill(array1D, -1);
            }
        }

        int a = solve(zero, one, true, limit, dp) % mod;
        int b = solve(zero, one, false, limit, dp) % mod;

        return (a + b) % mod;
    }
}
