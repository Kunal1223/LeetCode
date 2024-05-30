class Solution {

    public int FindMax(int[] aa) {
        int max = Integer.MIN_VALUE;
        for (int a : aa) {
            max = Math.max(max, a);
        }
        return max;
    }

    public int PossibleDays(int[] weight, int mid) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < weight.length; i++) {
            if (sum + weight[i] > mid) {
                count++;
                sum = 0;
            }
            sum += weight[i];
        }

        if (sum > 0) {
            count++;
        }
        return count;
    }

    public int shipWithinDays(int[] weight, int days) {
        int st = FindMax(weight);
        int en = 0;
        for (int w : weight) {
            en += w;
        }
        int ans = en;  

        while (st <= en) {
            int mid = st + (en - st) / 2;

            int w = PossibleDays(weight, mid);
            if (w <= days) {
                ans = mid;
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}
