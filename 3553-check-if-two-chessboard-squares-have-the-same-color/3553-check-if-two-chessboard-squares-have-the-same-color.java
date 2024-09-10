class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int val1 = 0 , val2 = 0;

        if((c1.charAt(0) - 'a') % 2 == 0){
            if((c1.charAt(1) - '0') % 2 == 0){
                val1 = 4;
            }else{
                val1 = 5;
            }
        }

        if((c1.charAt(0) - 'a') % 2 != 0){
            if((c1.charAt(1) - '0') % 2 == 0){
                val1 = 5;
            }else{
                val1 = 4;
            }
        }

        if((c2.charAt(0) - 'a') % 2 == 0){
            if((c2.charAt(1) - '0') % 2 == 0){
                val2 = 4;
            }else{
                val2 = 5;
            }
        }

        if((c2.charAt(0) - 'a') % 2 != 0){
            if((c2.charAt(1) - '0') % 2 == 0){
                val2 = 5;
            }else{
                val2 = 4;
            }
        }

        if(val1 == val2) return true;
        else return false;
    }
}