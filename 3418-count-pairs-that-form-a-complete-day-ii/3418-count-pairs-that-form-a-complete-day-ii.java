class Solution {
    public long countCompleteDayPairs(int[] hours) {
        Map<Integer, Integer> remcount = new HashMap<>();
        long ans = 0;

        for (int hour : hours) {
            int rem = hour % 24;
            int complement = (24 - rem) % 24;

            if (remcount.containsKey(complement)) {
                ans += remcount.get(complement);
            }

            remcount.put(rem, remcount.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }
}