class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        int[] count = new int[26]; // Assuming only lowercase English alphabets
        
        // Increment counts for characters in string s
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        
        // Decrement counts for characters in string t
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
        }
        
        // If all counts are zero, the strings are anagrams
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }
        
        return true;
    }
}
