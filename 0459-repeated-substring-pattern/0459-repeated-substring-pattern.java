public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        String doubled = s + s;
        String chotupart = doubled.substring(1 , doubled.length() - 1);
        
        return chotupart.contains(s);
    }
}