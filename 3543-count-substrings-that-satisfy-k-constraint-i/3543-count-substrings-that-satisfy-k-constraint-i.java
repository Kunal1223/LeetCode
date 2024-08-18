class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            int ocount = 0;
            int zcount  = 0;

            for(int j = i ; j < n ; j++){
                if(s.charAt(j) == '1'){
                    ocount++;
                }else{
                    zcount++;
                }


                if(ocount <= k || zcount <= k){
                    count++;
                }
            }
        }

        return count;
    }
}