class Solution {
    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        if(n == 0) return 0;

        int smallval = Math.min(x , y);
        int acnt = 0 , bcnt = 0 , ans = 0;

        for(int i =0 ; i < n ; i++){
            char c = s.charAt(i);

            if(c == 'a'){
                if(x < y && bcnt > 0){
                    ans += y;
                    bcnt--;
                }else{
                    acnt++;
                }
            }
            else if(c == 'b'){
                if(x > y && acnt > 0){
                    ans += x;
                    acnt--;
                }else{
                    bcnt++;
                }
            }else{
                ans += Math.min(acnt , bcnt)*smallval;
                acnt = 0;
                bcnt = 0;
            }
        }

        ans += Math.min(acnt , bcnt)*smallval;
        return ans;
    }
}