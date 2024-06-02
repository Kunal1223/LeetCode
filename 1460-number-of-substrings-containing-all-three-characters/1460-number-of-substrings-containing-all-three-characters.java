class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0 , n = s.length();

        int[] chec = {-1, -1, -1};
        for(int i = 0 ; i < n ; i++){
           char ch = s.charAt(i);
            chec[ch - 'a'] = i;

            if (chec[0] != -1 && chec[1] != -1 && chec[2] != -1) {
                count += 1 + Math.min(chec[0] , Math.min(chec[1] , chec[2]));
           }
        }

        return count;
    }
}