class Solution {
    public String minRemoveToMakeValid(String s) {

        int n = s.length();
        if(n == 1) return s;
        int count = 0;
        String ans = "";

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                count++;
                ans += ch;
            }
            else if(ch == ')'){
                count--;

                if(count < 0){
                    count = 0;
                }else{
                    ans += ch;
                }
            }
            else{
                ans += ch;
            }
        }

        n = ans.length();
        count = 0;
        String finala = "";

        for(int i = n-1 ; i >= 0 ; i--){

            char ch = ans.charAt(i);

            if(ch == '('){
                count--;

                if(count < 0){
                    count = 0;
                }else{
                    finala = ch + finala;
                }
            }

            else if(ch == ')'){
                count++;
                finala = ch + finala;
            }
            else{
                finala = ch + finala;
            }
        }
        
        return finala;
    }
}