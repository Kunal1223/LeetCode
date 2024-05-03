class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && opened++ > 0) res += c;
            if (c == ')' && opened-- > 1) res += c;
        }
        return res;
    }
}