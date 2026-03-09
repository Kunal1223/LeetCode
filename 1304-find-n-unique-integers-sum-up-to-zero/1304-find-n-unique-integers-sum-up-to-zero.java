class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];

        if((n%2) == 0){
            for(int i = 0; i < n/2; i++){
                ans[i] = i - n;
            }

            int j = n/2;
            for(int i = n/2; i < n; i++){
                ans[i] = Math.abs(ans[i-j]);
            }
        }
        else{

            for(int i = 0; i < n/2; i++){
                ans[i] = i - n;
            }

            ans[n/2] = 0;
            int j = n/2 + 1;
            for(int i = n/2+1; i < n; i++){
                ans[i] = Math.abs(ans[i-j]);
            }
        }

        return ans;
    }
}