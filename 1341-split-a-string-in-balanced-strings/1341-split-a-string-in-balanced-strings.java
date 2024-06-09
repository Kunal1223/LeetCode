class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0 , rvalue = 0;
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch == 'R') rvalue++;
            else rvalue--;

            if(rvalue == 0) ans++;
        }

        return ans;

    }
}