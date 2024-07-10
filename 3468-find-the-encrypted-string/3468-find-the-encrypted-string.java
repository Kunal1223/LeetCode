class Solution {
    public String getEncryptedString(String s, int k) {
        
        int n = s.length();
        String ans = "";

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt((i+k) % n);
            ans += ch;
        }

        return ans;
    }
}