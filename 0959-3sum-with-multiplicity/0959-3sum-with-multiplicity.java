public class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Map<Integer, Long> map = new HashMap<>();
        int mod = 1000000007;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }

        long result = 0;

        for (Map.Entry<Integer, Long> entry1 : map.entrySet()) {
            for (Map.Entry<Integer, Long> entry2 : map.entrySet()) {
                int i = entry1.getKey();
                int j = entry2.getKey();
                int k = target - i - j;

                if (!map.containsKey(k)) continue;

                if (i == j && j == k) {
                    long count = map.get(i);
                    result += count * (count - 1) * (count - 2) / 6;
                } else if (i == j && j != k) {
                    long countI = map.get(i);
                    long countK = map.get(k);
                    result += countI * (countI - 1) / 2 * countK;
                } 
                else if (i < j && j < k) {
                    long countI = map.get(i);
                    long countJ = map.get(j);
                    long countK = map.get(k);
                    result += countI * countJ * countK;
                }
            }
        }

        return (int) (result % mod);
    }
}