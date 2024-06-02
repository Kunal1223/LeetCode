class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans = "" , ans1 = "";

        for(String s1 : word1){
            ans = ans + s1 ;
        }

        for(String s2 : word2){
            ans1 = ans1 + s2;
        }

        if(ans.equals(ans1)){
            return true;
        }

        return false;
    }
}