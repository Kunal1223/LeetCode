class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int n = sentence.length();
        if(n < 26 ) return false;

        for(int i = 0 ; i < 26 ; i++){
            char ch = (char) (i+'a');
            if(sentence.indexOf(ch) == -1){
                return false;
            }
        }
        
        return true;
    }
}