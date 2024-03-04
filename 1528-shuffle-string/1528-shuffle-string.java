class Solution {
    public String restoreString(String s, int[] indices) {
        
        char []shift = new char[indices.length];
        char []original = s.toCharArray();
        
        for(int i = 0 ; i < s.length() ; i++){

            shift[indices[i]] = original[i];
        
        }
        
        String ans = new String(shift);
        
        return ans;
    }
}