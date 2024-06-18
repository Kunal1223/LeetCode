class Solution {
    public int numberOfChild(int n, int k) {
        boolean straight = true;
        int i = 0;

        while(k > 0){
            if(i == 0 ) straight = true;
            if(i == n-1) straight = false;

            if(straight){
                i++;
            }else{
                i--;
            }

            k--;
        }

        return i;
    }
}