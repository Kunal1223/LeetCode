class Solution {
    public int countOfSubstrings(String word, int k) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            String str = "";
            for (int j = i; j < word.length(); j++) {
                str = str + word.charAt(j);
                if (str.length() >= 5 && isVowel(str) && isCons(str, k)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isVowel(String str) {
        if (str.contains("" + 'a') && str.contains("" + 'e') &&
                str.contains("" + 'i') && str.contains("" + 'o') &&
                str.contains("" + 'u')) {
                    return true;
        }
        return false;
    }
    public static boolean isCons(String str, int k){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch != 'a' && ch != 'e' && ch != 'i' &&
             ch != 'o' && ch != 'u'){
                count++;
                if(count > k){
                    return false;
                }
             }
        }
        if(k > count){
            return false;
        }else{
            return true;
        }
    }
}