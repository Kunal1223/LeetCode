class Solution {
    public int passThePillow(int n, int time) {
        
        int i = 1 ;
        boolean flag = true;

        while(time > 0){

            if(i == 1){
                flag = true;
            }

            if(i == n){
                flag = false;
            }

            if(flag){
                i++;
            }else{
                i--;
            }

            time--;
        }

        return i;
    }
}