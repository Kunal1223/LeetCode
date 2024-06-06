import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> nums[a] - nums[b]);
        int store[] = new int[k];

        for (int i = 0; i < k; i++) {
            pq.add(i);
        }

        for (int i = k; i < nums.length; i++) {
            int j = pq.peek();
            if (nums[j] < nums[i]) {
                pq.poll();
                pq.add(i);
            }
        }

        int index = 0;
        while (!pq.isEmpty()) {
            store[index++] = pq.poll();
        }

        Arrays.sort(store);

        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = nums[store[i]];
        }

        return ans;
    }
}
