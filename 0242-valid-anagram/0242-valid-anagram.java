import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] k = t.toCharArray();
        
        Arrays.sort(c);
        Arrays.sort(k);
        
        String chec = new String(c);
        String chek = new String(k);
        
        
        return chec.equals(chek);
    }
}
