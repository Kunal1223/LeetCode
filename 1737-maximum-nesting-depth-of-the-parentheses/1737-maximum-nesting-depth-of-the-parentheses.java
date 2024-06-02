class Solution {
    public int maxDepth(String s) {

        int ans = 0;
        int opeb = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '(') {
                opeb++;
            } else if (s.charAt(i) == ')') {
                opeb--;
            }

            ans = Math.max(ans, opeb);
        }
        return ans;
    }
}