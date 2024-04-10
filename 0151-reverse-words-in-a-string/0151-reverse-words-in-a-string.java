class Solution {
    public String reverseWords(String s) {
        
        char str[] = s.toCharArray();
        char ans[] = new char[s.length()+1];
        
        int l = s.length() - 1;
        int k;
        int i = 0;
        
        while (l >= 0) {
            while (l >= 0 && str[l] == ' ') {
                l--;
            }
            
            if (l < 0) break;
            
            k = l;
            
            while (l >= 0 && str[l] != ' ') {
                l--;
            }
            
            for (int j = l + 1; j <= k; j++) {
                ans[i++] = str[j];
            }
            
            ans[i++] = ' ';
        }
        return new String(ans, 0, i-1);
    }
}
