class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                res = Math.max(res, i - map.get(ch) - 1);
            } else {
                map.put(ch, i);
            }
        }

        if (res == Integer.MIN_VALUE) {
            return -1;
        } else {
            return res;
        }
    }
}