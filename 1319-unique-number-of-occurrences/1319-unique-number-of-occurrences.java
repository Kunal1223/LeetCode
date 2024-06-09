class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occur = new HashMap<>();
        for (int num : arr) {
            occur.put(num, occur.getOrDefault(num, 0) + 1);
        }

        Set<Integer> unique = new HashSet<>();
        for (int count : occur.values()) {
            if (!unique.add(count)) {
                return false; 
            }
        }

        return true; 
    }
}
