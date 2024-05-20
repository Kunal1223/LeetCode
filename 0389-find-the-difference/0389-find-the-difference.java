class Solution {
    public char findTheDifference(String s, String t) {
        
        if(s.length() == 0) return t.charAt(0);
        
        int alphab[] = new int[26];
        
        for(int i = 0 ; i  < s.length() ; i++){
            alphab[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < t.length() ; i++){
            alphab[t.charAt(i) - 'a'] --;
        }
        
        for (int i = 0; i < 26; i++) {
            if (alphab[i] != 0) {
                char ans = (char) (i + 'a');
                return ans;
            }
        }

        
        return 'a';
    }
}