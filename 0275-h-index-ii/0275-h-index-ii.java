class Solution {
    public int hIndex(int[] citations) {
        int ans = 0;
        int n = citations.length;
        for(int i = 0 ; i < n ; i++){

            int h = Math.min(citations[i] , n-i);
            ans = Math.max(ans , h);
        }
        
        return ans;
    }
}