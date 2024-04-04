class Solution {
    public boolean judgeCircle(String moves) {
        
        int c1 = 0;
        int c2 = 0;

        for(int i = 0 ; i < moves.length() ; i++){
           char ch = moves.charAt(i);

            if(ch == 'L')
                c1++;

            if(ch == 'R')
                c1--;

            if(ch == 'U')
                c2++;

            if(ch == 'D')
                c2--;
        }

        if(c1 != 0 || c2 !=0)
            return false;

        return true;
    }
}