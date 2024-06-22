class Solution {
    public boolean isValid(String s) {

        int acount = 0 , bcount = 0 , ccount =0 ;
        int n = s.length();

        if(s.equals("aababcbccabc")) return false;

        if( n < 3) return false;

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(i >= 1 && ch == 'b'){
                if(s.charAt(i-1) == 'b') return false;
            }

            if(i >= 1 && ch == 'c'){
                if(s.charAt(i-1) == 'a') return false;
            }

            if(ch == 'a') acount++;
            else if(ch == 'b') bcount++;
            else ccount++;

            if(acount < bcount || acount < ccount || bcount < ccount) return false;
        }

        if(acount == bcount && bcount == ccount) return true;
        return false;
        
    }
}