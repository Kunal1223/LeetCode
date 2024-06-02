class Solution {
    public int myAtoi(String s) {
        s = s.trim(); 
        int n = s.length();
        if (n == 0) return 0;

        int i = 0, num = 0;
        boolean neg = false;

        if (s.charAt(0) == '-') {
            neg = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < n) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {

                if (num > (Integer.MAX_VALUE - (ch - '0')) / 10) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                num = num * 10 + (ch - '0');
            } else {
                break; 
            }
            i++;
        }

        num = neg ? -num : num;

        if (num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (num > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return num;
    }
}
