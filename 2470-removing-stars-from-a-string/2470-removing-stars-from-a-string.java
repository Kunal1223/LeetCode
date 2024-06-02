class Solution {
    public String removeStars(String s) {
        int n = s.length() , count = 0;
        String ans = "";

        for(int i = n-1 ; i>= 0 ; i--){
            char ch = s.charAt(i);

            if(ch == '*'){
                count++;
            }else{
                if(count == 0 && i >= 0){
                    ans = s.charAt(i) + ans;
                }

                if(count > 0){
                    count--;
                }
            }
        }

        return ans;
    }
}