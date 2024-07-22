class Solution {

    public boolean isVowel(Character ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public boolean doesAliceWin(String s) {
        char vowel[] = s.toCharArray();
        int count = 0 , n = s.length();

        for(int i = 0 ; i < n ; i++){
            char ch = vowel[i];

            if(isVowel(ch)){
                count++;
            }
        }
        
        if(count == 0) return false;
        else return true;
    }
}