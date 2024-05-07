class Solution {

    public boolean itsFine(String s , int len){

        int n = s.length();
        int firstfrequency[] = new int[26];

        for(int i = 0 ; i < len ; i++){
            firstfrequency[s.charAt(i) - 'a']++;
        }

        for(int i = len ; i < n ; i += len){
            int range[] = new int[26];

            for(int j = i ; j < i + len ; j++){
                range[s.charAt(j) - 'a']++;
            }

            for(int m = 0 ; m < 26 ; m++){
                if(firstfrequency[m] != range[m]){
                    return false;
                }
            }
        }

        return true;
    }

    public int minAnagramLength(String s) {
        int n = s.length();

        for(int len = 1 ; len < n ; len++){

            if(n % len == 0  && itsFine(s , len)){
                return len;
            }
        }

        return n;
    }
}