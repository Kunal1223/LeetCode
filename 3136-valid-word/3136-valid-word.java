class Solution {

    public boolean isVowel(char c){

        if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' 
        ||c == 'I' || c == 'O' ||c == 'U' ){
            return true;
        }

        return false;
    }

    public boolean isValid(String word) {
        
        int n = word.length();
        if(n < 3) return false;
        int vowel = 0 , cons = 0;

        for(int i = 0 ;  i < n ; i++){
            char ch = word.charAt(i);

            if(isVowel(ch)){
                vowel++;
            }
            else{

                if(!(ch >= '0' && ch <= '9'))
                    cons++;
            }

            if(ch == '@' || ch == '#' ||ch == '$' ){
                return false;
            }

        }

        if(n >= 3 && vowel > 0 && cons > 0){
            return true;
        }

        return false;

    }
}