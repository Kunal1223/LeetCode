class Solution {
    public String getSmallestString(String s) {
        int n = s.length();
        char []s1 = s.toCharArray();

        for(int i = 0 ; i < n-1 ; i++){
            int first = s1[i] - '0';
            int sec = s1[i+1] - '0';

            if((first % 2 == 0 && sec % 2 == 0 && first > sec) || (first % 2 != 0 && 
            sec % 2 != 0 && first > sec) ){

                char temp = s1[i];
                s1[i] =  (char) (sec + '0');
                s1[i+1] = temp;

                return new String(s1);
            }
        }

        return s;
    }
}