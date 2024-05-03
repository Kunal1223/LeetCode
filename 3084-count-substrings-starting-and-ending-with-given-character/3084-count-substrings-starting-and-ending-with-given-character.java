class Solution {
    public long countSubstrings(String s, char c) {

        long count = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == c){
                count++;
            }
        }

        if(count == 0) return 0;
        else if(count == 1) return 1;
        else return (count * (count+1))/2;
    }
}