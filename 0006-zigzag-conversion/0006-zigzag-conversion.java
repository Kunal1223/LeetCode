class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= 1) {
            return s;
        }

        StringBuilder ans = new StringBuilder();
        int increment = 2 * numRows - 2;

        for (int r = 0; r < numRows; r++) {
            for (int i = r; i < s.length(); i += increment) {
                ans.append(s.charAt(i));

                if (r > 0 && r < numRows - 1) {
                    int midadd = i + increment - 2 * r;
                    if (midadd < s.length()) {
                        ans.append(s.charAt(midadd));
                    }
                }
            }
        }

        return ans.toString();
    }
}
