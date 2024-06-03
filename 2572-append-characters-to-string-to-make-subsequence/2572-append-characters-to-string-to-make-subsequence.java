class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();

        int i = 0 , j = 0;

        while(i < n && j < m){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);

            if(ch1 == ch2){
                i++;
                j++;
            }else{
                i++;
            }
        }

        if(j == m){
            return 0;
        }else{
            return m -j;
        }
    }
}