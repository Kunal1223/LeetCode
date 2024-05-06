class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        if(n== 1) return 1;
        int count = 0 , ans = 0;

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch == '('){
                count++;
            }else{
                count--;
            }

            if(count < 0){
                ans += Math.abs(count);
                count = 0;
            }
        }

        return ans + Math.abs(count);
    }
}