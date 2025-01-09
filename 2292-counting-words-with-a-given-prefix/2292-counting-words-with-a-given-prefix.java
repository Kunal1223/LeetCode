class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = words.length;
        int count = 0;

        for(int i = 0 ; i < n ; i++){
            int ind = words[i].indexOf(pref);

            if(ind == 0) count++;
        }

        return count;
    }
}