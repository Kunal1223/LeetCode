class Solution {

    public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k > s.length()) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        while (i < s.length() && map.get(s.charAt(i)) >= k) {
            i++;
        }

        if (i >= s.length() - 1) {
            return i;
        }

        int left = longestSubstring(s.substring(0, i), k);
        while (i < s.length() && map.get(s.charAt(i)) < k) {
            i++;
        }
        int right = longestSubstring(s.substring(i), k);

        return Math.max(left, right);
    }
}
